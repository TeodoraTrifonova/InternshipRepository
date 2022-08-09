package com.example.forecastbyplaceproject.data.services.crud.interfaces;

import com.example.forecastbyplaceproject.data.entities.forecast.ExternalForecast;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
@Service
public class GetExternalForecast {
    public ExternalForecast getExternalForecast(String city)
    {
        if(city.length()<3)
        {
            throw new NoSuchElementException();
        }
        return ExternalForecast.builder()
                .temp(31.0)
                .humidity(56.1)
                .build();
    }
    // ako city < 3 vrushtam city not found error inache vrushta external
    //forecast hardcode-nat   (ima temperatura + vlajnost)
}

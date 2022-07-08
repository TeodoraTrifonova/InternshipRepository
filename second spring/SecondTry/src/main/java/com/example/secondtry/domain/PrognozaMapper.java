package com.example.secondtry.domain;

import com.example.secondtry.service.WheatherService;
import org.springframework.stereotype.Service;

@Service
public class PrognozaMapper {

    public String getWeather(Weather weather)
    {
        String str = "Location: x=" +weather.prognozaKoordinati.getX() +", y="
                + weather.getPrognozaKoordinati().getY() + ", Weather: " +
                weather.getPrognozaZaVreme().getPrognoza();
        return str;

    }
}

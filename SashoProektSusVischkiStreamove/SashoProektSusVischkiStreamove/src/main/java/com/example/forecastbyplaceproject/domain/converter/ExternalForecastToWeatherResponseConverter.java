package com.example.forecastbyplaceproject.domain.converter;

import com.example.forecastbyplaceproject.api.models.weather.WeatherResponse;
import com.example.forecastbyplaceproject.data.entities.forecast.ExternalForecast;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ExternalForecastToWeatherResponseConverter implements Converter<ExternalForecast, WeatherResponse> {

    @Override
    public WeatherResponse convert(ExternalForecast source) {
        return WeatherResponse.builder()
                .temp(source.getTemp().toString())
                .humidity(source.getHumidity().toString())
                .build();
    }


}

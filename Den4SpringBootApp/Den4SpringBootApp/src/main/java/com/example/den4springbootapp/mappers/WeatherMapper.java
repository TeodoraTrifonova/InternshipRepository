package com.example.den4springbootapp.mappers;

import com.example.den4springbootapp.domain.models.Weather;
import org.springframework.stereotype.Service;

@Service
public class WeatherMapper{
    public String getWeather(Weather weather){
        return "Weather in "+weather.getForecast()+ ":\n Temperature in Celsius:"+
                weather.getCurrent().temp_c+"\n Condition:"+
                weather.getCondition().text+"\n";
    }
}

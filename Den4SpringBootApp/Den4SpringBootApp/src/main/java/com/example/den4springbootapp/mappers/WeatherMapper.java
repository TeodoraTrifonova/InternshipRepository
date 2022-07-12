package com.example.den4springbootapp.mappers;

import com.example.den4springbootapp.domain.models.Weather;
import org.springframework.stereotype.Service;

@Service
public class WeatherMapper{
    public String getWeather(Weather weather){
        return "Weather in "+weather.getRegiont()+ ":\n Temperature in Celsius:"+
                weather.getTemp()+"\n Condition:"+
                weather.getCondition()+"\n";
    }
}

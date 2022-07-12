package com.example.den4springbootapp.domain.services.interfaces;

import com.example.den4springbootapp.domain.models.Coordinate;
import com.example.den4springbootapp.domain.models.Weather;

public interface WeatherService {
    Weather getForecast(Coordinate coordinate);
}

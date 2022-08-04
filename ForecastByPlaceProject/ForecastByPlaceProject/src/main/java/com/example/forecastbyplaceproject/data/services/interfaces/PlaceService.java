package com.example.forecastbyplaceproject.data.services.interfaces;

import com.example.forecastbyplaceproject.api.models.WeatherRequest;
import com.example.forecastbyplaceproject.api.models.WeatherResponse;
import com.example.forecastbyplaceproject.data.entities.forecast.Forecast;
import org.springframework.stereotype.Service;

public interface PlaceService {
WeatherResponse getWeatherByLocation(WeatherRequest weatherRequest);
}

package com.example.forecastbyplaceproject.domain;

import com.example.forecastbyplaceproject.api.models.WeatherRequest;
import com.example.forecastbyplaceproject.api.models.WeatherResponse;
import com.example.forecastbyplaceproject.data.services.interfaces.PlaceService;
import com.example.forecastbyplaceproject.domain.interfaces.WeatherExecutor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class WeatherExecutorImpl implements WeatherExecutor {
    private final PlaceService placeService;

    public WeatherExecutorImpl(PlaceService placeService) {
        this.placeService = placeService;
    }

    @Override
    public WeatherResponse execute(WeatherRequest weatherRequest) {
        return placeService.getWeatherByLocation(weatherRequest);
    }
}

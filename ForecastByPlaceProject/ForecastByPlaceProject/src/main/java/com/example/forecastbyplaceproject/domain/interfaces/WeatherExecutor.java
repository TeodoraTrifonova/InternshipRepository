package com.example.forecastbyplaceproject.domain.interfaces;

import com.example.forecastbyplaceproject.api.models.WeatherRequest;
import com.example.forecastbyplaceproject.api.models.WeatherResponse;

public interface WeatherExecutor {
    WeatherResponse execute(WeatherRequest weatherRequest);
}

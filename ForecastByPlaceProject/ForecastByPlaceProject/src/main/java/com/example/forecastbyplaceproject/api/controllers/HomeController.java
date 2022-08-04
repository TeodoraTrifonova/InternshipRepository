package com.example.forecastbyplaceproject.api.controllers;

import com.example.forecastbyplaceproject.api.models.WeatherRequest;
import com.example.forecastbyplaceproject.api.models.WeatherResponse;
import com.example.forecastbyplaceproject.domain.interfaces.WeatherExecutor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final WeatherExecutor weatherExecutor;

    public HomeController(WeatherExecutor weatherExecutor) {
        this.weatherExecutor = weatherExecutor;
    }

    @PostMapping("/getWeather")
    public WeatherResponse getWeather(@RequestBody WeatherRequest weatherRequest){
        return weatherExecutor.execute(weatherRequest);
    }

}

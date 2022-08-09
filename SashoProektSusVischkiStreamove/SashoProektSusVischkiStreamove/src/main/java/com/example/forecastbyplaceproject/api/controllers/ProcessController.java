package com.example.forecastbyplaceproject.api.controllers;

import com.example.forecastbyplaceproject.api.models.weather.WeatherRequest;
import com.example.forecastbyplaceproject.api.models.weather.WeatherResponse;
import com.example.forecastbyplaceproject.api.operation.GetForecastByPlaceProcessor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcessController {

    private  final GetForecastByPlaceProcessor getForecastByPlaceProcessor;

    public ProcessController(GetForecastByPlaceProcessor getForecastByPlaceProcessor) {
        this.getForecastByPlaceProcessor = getForecastByPlaceProcessor;
    }


    @PostMapping("/process")
    public WeatherResponse getForecast(@RequestBody WeatherRequest weatherRequest)
    {
        return  getForecastByPlaceProcessor.process(weatherRequest).get();
    }
}

package com.example.den4springbootapp.controller;

import com.example.den4springbootapp.requestMapper.WeatherStationRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherStationController {

    @GetMapping("/station")
    public String getStation(@RequestBody WeatherStationRequest weatherStationRequest)
    {
        return weatherStationRequest.toString();

    }
}

package com.example.den4springbootapp.controller;

import com.example.den4springbootapp.requestMapper.WeatherStationRequest;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherStationController {

    @PostMapping("/weatherStation")
    public String getWeatherStation(@RequestBody WeatherStationRequest weatherStationRequest){
        return weatherStationRequest.toString();
    }
}

package com.example.den4springbootapp.controller;

import com.example.den4springbootapp.domain.models.Coordinate;
import com.example.den4springbootapp.domain.services.interfaces.WeatherService;
import com.example.den4springbootapp.mappers.WeatherMapper;
import com.example.den4springbootapp.requestMapper.WeatherRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    private final WeatherService weatherService;

    private final WeatherMapper weatherMapper;

    public HomeController(WeatherService weatherService, WeatherMapper weatherMapper) {
        System.out.println("Home Controller Created");
        this.weatherService = weatherService;
        this.weatherMapper = weatherMapper;
    }


    @GetMapping("/")
    public String getHelloString(){
        return "Please type /weather in the url bar to enable functionality";
    }

    @PostMapping("/weather")
    public String getWeather(@RequestBody WeatherRequest weatherRequest){

        return weatherMapper.getWeather(weatherService.getForecast(new Coordinate(
                Double.parseDouble(weatherRequest.getX()),
                Double.parseDouble(weatherRequest.getY())
        )));

      /*  return weatherMapper.getWeather(testWeatherService.generateForecast(new Coordinate(
                Double.parseDouble(weatherRequest.getX()),
                Double.parseDouble(weatherRequest.getY()))));*/
    }
}

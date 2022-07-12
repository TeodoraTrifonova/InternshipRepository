package com.example.den4springbootapp.domain.services;

import com.example.den4springbootapp.domain.models.Coordinate;
import com.example.den4springbootapp.domain.models.Weather;
import com.example.den4springbootapp.domain.models.weatherapi.Condition;
import com.example.den4springbootapp.domain.models.weatherapi.OpenWeatherAPIRequest;
import com.example.den4springbootapp.domain.services.interfaces.RestTemplateProvider;
import com.example.den4springbootapp.domain.services.interfaces.WeatherService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestWeatherService  implements WeatherService { //vryshta prognozata za vremeto pri zadadeni koordinati

    public TestWeatherService() {
        System.out.println("TestWeatherService initialized");
    }


    @Override
    public Weather getForecast(Coordinate coordinate) {
        Weather weather = new Weather("Varna","28.4","Sunny");
        return weather;

    }
}
//Pravim interface weatherService
//Pravim RestTemplateProvider - interface
//Log v console v konstruktura na wsichkite servisi koga se e syzdal
//TestWeatherService - vryshta static weather - implementaciq na weatherservice

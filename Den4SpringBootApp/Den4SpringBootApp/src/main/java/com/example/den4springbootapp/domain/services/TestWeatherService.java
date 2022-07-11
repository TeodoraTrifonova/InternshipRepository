package com.example.den4springbootapp.domain.services;

import com.example.den4springbootapp.domain.models.Coordinate;
import com.example.den4springbootapp.domain.models.weatherapi.OpenWeatherAPIRequest;
import com.example.den4springbootapp.domain.models.Weather;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestWeatherService { //vryshta prognozata za vremeto pri zadadeni koordinati
    public Weather generateForecast(Coordinate coordinates) {

        final String key = "c782585acdc84252b3790106220807";

        final String uri = "http://api.weatherapi.com/v1/current.json?key=" + key + "&q=" + coordinates.getLat()
                + "," + coordinates.getLon();

        RestTemplate restTemplate = new RestTemplate();
        OpenWeatherAPIRequest owar = restTemplate.getForObject(uri, OpenWeatherAPIRequest.class);
        Weather weather = new Weather(coordinates, owar.current.condition, owar.current);
        weather.setForecast(owar.location.region);
        return weather;
    }
}
//Pravim interface weatherService
//Pravim RestTemplateProvider - interface
//Log v console v konstruktura na wsichkite servisi koga se e syzdal
//TestWeatherService - vryshta static weather - implementaciq na weatherservice

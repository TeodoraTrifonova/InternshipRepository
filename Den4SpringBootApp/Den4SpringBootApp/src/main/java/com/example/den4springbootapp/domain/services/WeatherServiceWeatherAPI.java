package com.example.den4springbootapp.domain.services;

import com.example.den4springbootapp.domain.models.Coordinate;
import com.example.den4springbootapp.domain.models.Weather;
import com.example.den4springbootapp.domain.models.weatherapi.OpenWeatherAPIRequest;
import com.example.den4springbootapp.domain.services.interfaces.RestTemplateProvider;
import com.example.den4springbootapp.domain.services.interfaces.WeatherService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Primary
public class WeatherServiceWeatherAPI implements WeatherService {
    private final RestTemplateProvider restTemplateProvider;
    public WeatherServiceWeatherAPI(RestTemplateProvider restTemplateProvider) {
        this.restTemplateProvider = restTemplateProvider;
        System.out.println("WeatherServiceWeatherAPI is created");
    }

    @Override
    public Weather getForecast(Coordinate coordinate) {
        final String key = "c782585acdc84252b3790106220807";

        final String uri = "http://api.weatherapi.com/v1/current.json?key=" + key + "&q=" + coordinate.getLat()
                + "," + coordinate.getLon();

        RestTemplate restTemplate=restTemplateProvider.getTemplate();
        OpenWeatherAPIRequest owar = restTemplate.getForObject(uri, OpenWeatherAPIRequest.class);
     //   Weather weather = new Weather(owar.location.region, String.valueOf(owar.current.temp_c),owar.current.condition.text);
        return Weather.builder()
                .regiont(owar.getLocation().getRegion())
                .temp(String.valueOf(owar.getCurrent().getTemp_c()))
                .condition(owar.getCurrent().getCondition().getText()).build();

    }
}

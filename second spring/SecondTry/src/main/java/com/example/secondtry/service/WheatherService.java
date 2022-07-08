package com.example.secondtry.service;

import com.example.secondtry.domain.PrognozaKoordinati;
import com.example.secondtry.domain.PrognozaZaVreme;
import com.example.secondtry.domain.Weather;
import org.springframework.stereotype.Service;

@Service
public class WheatherService {

   public Weather getWeather()
    {
        PrognozaKoordinati coor = new PrognozaKoordinati();
        PrognozaZaVreme prognozaZaVreme = new PrognozaZaVreme("slunchevo");
        Weather weather = new Weather(prognozaZaVreme, coor);
        return weather;
    }
}

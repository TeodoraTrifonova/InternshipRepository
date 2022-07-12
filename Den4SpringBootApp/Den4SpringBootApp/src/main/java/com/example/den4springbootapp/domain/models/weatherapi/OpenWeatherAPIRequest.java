package com.example.den4springbootapp.domain.models.weatherapi;

import com.example.den4springbootapp.domain.models.weatherapi.Current;
import com.example.den4springbootapp.domain.models.weatherapi.Location;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter(AccessLevel.PRIVATE)
@Getter
public class OpenWeatherAPIRequest {
    private Location location;
    private Current current;
}

package com.example.den4springbootapp.domain.models.weatherapi;

import com.example.den4springbootapp.domain.models.weatherapi.Current;
import com.example.den4springbootapp.domain.models.weatherapi.Location;
import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class OpenWeatherAPIRequest {
    private Location location;
    private Current current;
}

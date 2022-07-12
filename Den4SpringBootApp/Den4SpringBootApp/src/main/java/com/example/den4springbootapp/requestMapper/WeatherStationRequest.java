package com.example.den4springbootapp.requestMapper;

import lombok.*;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PRIVATE)
@ToString
@Builder
public class WeatherStationRequest {
    private String name;
    private String location;
    private Double lat;
    private Double lon;
    private String seaLevel;
    private String typeStation;
}

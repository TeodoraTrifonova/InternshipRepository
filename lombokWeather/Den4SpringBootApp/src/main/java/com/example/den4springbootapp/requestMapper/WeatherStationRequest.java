package com.example.den4springbootapp.requestMapper;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
public class WeatherStationRequest {
    private String weatherStationName;
    private Double lat;
    private Double lon;
    private Double seaLevelHeight;
    private Boolean type;
}

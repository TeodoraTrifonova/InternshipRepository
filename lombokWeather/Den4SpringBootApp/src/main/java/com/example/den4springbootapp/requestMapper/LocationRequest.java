package com.example.den4springbootapp.requestMapper;

import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@ToString
public class LocationRequest {
    private String label;
    private Double lat;
    private Double lon;
}

package com.example.den4springbootapp.domain.models;


import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@ToString
@AllArgsConstructor
public class Coordinate {
    private double lat;
    private double lon;
}

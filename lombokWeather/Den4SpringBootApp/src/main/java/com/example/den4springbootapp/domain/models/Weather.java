package com.example.den4springbootapp.domain.models;


import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
@ToString
public class Weather {
    private String region;
    private String temp;
    private String condition;
}

package com.example.den4springbootapp.domain.models.weatherapi;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter(AccessLevel.PRIVATE)
@Getter
public class Condition{
    private String text;
    private String icon;
    private int code;
}

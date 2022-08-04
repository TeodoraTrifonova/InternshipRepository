package com.example.den4springbootapp.domain.models.weatherapi;

import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Condition{
    private String text;
    private String icon;
    private int code;
}

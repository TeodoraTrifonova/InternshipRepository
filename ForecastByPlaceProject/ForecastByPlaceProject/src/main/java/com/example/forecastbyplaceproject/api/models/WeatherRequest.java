package com.example.forecastbyplaceproject.api.models;

import com.example.forecastbyplaceproject.api.base.OperationInput;
import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@ToString
public class WeatherRequest implements OperationInput {
    private String place;
    private String country;
}

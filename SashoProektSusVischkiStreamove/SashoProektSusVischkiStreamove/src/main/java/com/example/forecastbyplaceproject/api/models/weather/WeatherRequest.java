package com.example.forecastbyplaceproject.api.models.weather;

import com.example.forecastbyplaceproject.api.base.OperationInput;
import com.example.forecastbyplaceproject.config.YesNoBooleanDeserializer;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import lombok.extern.jackson.Jacksonized;
import org.springframework.stereotype.Service;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@ToString
@Jacksonized
public class WeatherRequest implements OperationInput {
    @JsonAlias("myPlace")
    private String place;
    @JsonAlias("myCountry")
    private String country;
    @JsonDeserialize(using = YesNoBooleanDeserializer.class)
    private Boolean fahrenheit;
}

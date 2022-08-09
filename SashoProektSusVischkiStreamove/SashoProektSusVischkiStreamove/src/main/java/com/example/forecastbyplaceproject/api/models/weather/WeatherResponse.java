package com.example.forecastbyplaceproject.api.models.weather;

import com.example.forecastbyplaceproject.data.repositories.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class WeatherResponse implements OperationResult {
    private String placeName;
    private String typeName;
    private String countryName;
    private String temp;
    private String humidity;
}

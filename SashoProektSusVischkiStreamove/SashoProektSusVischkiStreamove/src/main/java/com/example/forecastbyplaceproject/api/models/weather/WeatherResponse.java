package com.example.forecastbyplaceproject.api.models.weather;

import com.example.forecastbyplaceproject.api.base.OperationResult;
import lombok.*;
import org.springframework.stereotype.Service;

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
}

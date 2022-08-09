package com.example.forecastbyplaceproject.data.entities.forecast;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ExternalForecast {
    public  Double temp;
    public Double humidity;
}

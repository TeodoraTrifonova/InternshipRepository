package com.example.forecastbyplaceproject.domain.processor;

import com.example.forecastbyplaceproject.data.entities.forecast.ExternalForecast;
import com.example.forecastbyplaceproject.data.repositories.base.Error;
import com.example.forecastbyplaceproject.api.models.weather.WeatherRequest;
import com.example.forecastbyplaceproject.api.models.weather.WeatherResponse;
import com.example.forecastbyplaceproject.api.operation.GetForecastByPlaceProcessor;
import com.example.forecastbyplaceproject.data.services.crud.interfaces.GetExternalForecast;
import com.example.forecastbyplaceproject.data.services.weather.interfaces.PlaceService;
import io.vavr.control.Either;
import io.vavr.control.Try;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
public class GetForecastByPlaceProcessorDomain implements GetForecastByPlaceProcessor {

    private final PlaceService placeService;
    private final GetExternalForecast getExternalForecast;

    private final ConversionService conversionService;

    public GetForecastByPlaceProcessorDomain(PlaceService placeService, GetExternalForecast getExternalForecast, ConversionService conversionService) {
        this.placeService = placeService;
        this.getExternalForecast = getExternalForecast;
        this.conversionService = conversionService;
    }

    @Override
    public Either<Error, WeatherResponse> process(WeatherRequest weatherRequest) {
     return Try.of(()->{
         return conversionService.convert(getExternalForecast)
     });
    }
}

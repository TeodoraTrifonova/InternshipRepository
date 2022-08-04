package com.example.forecastbyplaceproject.domain.processor;

import com.example.forecastbyplaceproject.api.base.Error;
import com.example.forecastbyplaceproject.api.models.weather.WeatherRequest;
import com.example.forecastbyplaceproject.api.models.weather.WeatherResponse;
import com.example.forecastbyplaceproject.api.operation.GetForecastByPlaceProcessor;
import com.example.forecastbyplaceproject.data.services.weather.interfaces.PlaceService;
import io.vavr.control.Either;

import java.util.stream.Stream;

public class GetForecastByPlaceProcessorDomain implements GetForecastByPlaceProcessor {

    private final PlaceService placeService;

    public GetForecastByPlaceProcessorDomain(PlaceService placeService) {
        this.placeService = placeService;
    }

    @Override
    public Either<Error, WeatherResponse> process(WeatherRequest weatherRequest) {
        return Either.right(Stream.of(placeService.getWeatherByLocation(weatherRequest))
                .map(weatherResponseMapper -> WeatherResponse.builder()
                        .countryName(weatherResponseMapper.getCountryName())
                        .temp(weatherResponseMapper.getTemp())
                        .typeName(weatherResponseMapper.getTypeName())
                        .placeName(weatherResponseMapper.getPlaceName())
                        .build())
                .findAny()
                .orElseThrow());
    }
}

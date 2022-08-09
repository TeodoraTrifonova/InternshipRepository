package com.example.forecastbyplaceproject.api.operation;

import com.example.forecastbyplaceproject.data.repositories.base.Error;
import com.example.forecastbyplaceproject.data.repositories.base.OperationProcessor;
import com.example.forecastbyplaceproject.api.models.weather.WeatherRequest;
import com.example.forecastbyplaceproject.api.models.weather.WeatherResponse;
import io.vavr.control.Either;

public interface GetForecastByPlaceProcessor extends OperationProcessor<WeatherRequest, WeatherResponse> {

    Either<Error, WeatherResponse> process(WeatherRequest operationInput);
}

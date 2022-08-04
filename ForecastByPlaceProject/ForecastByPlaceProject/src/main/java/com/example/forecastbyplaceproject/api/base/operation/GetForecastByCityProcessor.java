package com.example.forecastbyplaceproject.api.base.operation;

import com.example.forecastbyplaceproject.api.base.Error;
import com.example.forecastbyplaceproject.api.base.OperationInput;
import com.example.forecastbyplaceproject.api.base.OperationProcessor;
import com.example.forecastbyplaceproject.api.base.OperationResult;
import com.example.forecastbyplaceproject.api.models.WeatherRequest;
import com.example.forecastbyplaceproject.api.models.WeatherResponse;
import io.vavr.control.Either;

public interface GetForecastByCityProcessor extends OperationProcessor<WeatherRequest, WeatherResponse> {


    Either<Error, WeatherResponse> process(WeatherRequest operationInput);
}

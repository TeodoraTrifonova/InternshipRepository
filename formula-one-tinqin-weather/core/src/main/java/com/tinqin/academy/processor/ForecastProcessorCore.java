package com.tinqin.academy.processor;

import com.tinqin.academy.base.Error;
import com.tinqin.academy.entity.Location;
import com.tinqin.academy.error.ForecastServiceUnavailableError;
import com.tinqin.academy.error.LocationNotFoundError;
import com.tinqin.academy.model.LocationRequest;
import com.tinqin.academy.model.LocationResponse;
import com.tinqin.academy.operation.ForecastProcess;
import com.tinqin.academy.repository.LocationRepository;
import com.tinqin.academy.weatherclient.model.Forecast;
import com.tinqin.academy.weatherclient.service.WeatherClientExcemption;
import com.tinqin.academy.weatherclient.service.WeatherClientService;
import io.vavr.control.Either;
import io.vavr.control.Try;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ForecastProcessorCore implements ForecastProcess {
    private final LocationRepository locationRepository;
    private final WeatherClientService weatherClientService;

    public ForecastProcessorCore(LocationRepository locationRepository, WeatherClientService weatherClientService) {
        this.locationRepository = locationRepository;
        this.weatherClientService = weatherClientService;
    }

    @Override
    public Either<Error, LocationResponse> process(final LocationRequest input) {
        return Try.of(()->{
            final Optional<Location> location=locationRepository.findLocationByName(input.getLocation());
            final Location loc=location.orElseThrow();
            final Forecast forecast=weatherClientService.getForecastByLatAndLon(loc.getLat(),loc.getLon());
            return LocationResponse.builder()
                    .locationName(location.get().getName())
                    .locationID(String.valueOf(location.get().getLocationID()))
                    .temperature(String.valueOf(forecast.getCurrent().getTemp_c())+ " Celsius")
                    .humidity(String.valueOf(forecast.getCurrent().getHumidity())+ "%")
                    .rain(forecast.getCurrent().getCondition().getText())
                    .build();

        }).toEither()
            .mapLeft(throwable -> {
                if(throwable instanceof WeatherClientExcemption){
                    return new ForecastServiceUnavailableError();
                }
                if(throwable instanceof NoSuchElementException){
                    return new LocationNotFoundError();
                }
                return new ForecastServiceUnavailableError();
            });
    }
}

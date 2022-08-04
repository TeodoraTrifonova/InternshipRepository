package com.example.forecastbyplaceproject.api.base;

import org.springframework.http.HttpStatus;

public interface Error {
    HttpStatus getError();
    String getMessage();
}

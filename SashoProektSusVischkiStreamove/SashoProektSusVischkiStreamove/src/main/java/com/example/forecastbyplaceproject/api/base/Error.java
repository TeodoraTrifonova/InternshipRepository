package com.example.forecastbyplaceproject.api.base;

import org.springframework.http.HttpStatus;

public interface Error {

   String getMessage();
   HttpStatus getCode();
}

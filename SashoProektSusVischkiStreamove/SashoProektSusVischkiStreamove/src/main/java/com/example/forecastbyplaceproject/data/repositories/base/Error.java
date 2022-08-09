package com.example.forecastbyplaceproject.data.repositories.base;

import org.springframework.http.HttpStatus;

public interface Error {

   String getMessage();
   HttpStatus getCode();
}

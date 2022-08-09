package com.example.forecastbyplaceproject.data.repositories.base;

import io.vavr.control.Either;

public interface OperationProcessor <I extends OperationInput,R extends OperationResult> {
    Either<Error,R > process(I operationInput);
}

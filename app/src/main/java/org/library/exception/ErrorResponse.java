package org.library.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

public interface ErrorResponse {
    String getCode();

    String getMessage();

    HttpStatus getHttpStatus();

    default ApplicationException toException() {
        return new ApplicationException(getCode(), getMessage(), getHttpStatus());
    }

    default void throwException() {
        throw toException();
    }

    default ErrorResponse formatMessage(Object... formatParams) {
        return new ErrorResponseImpl(getCode(), getMessage().formatted(formatParams), getHttpStatus());
    }

    @Getter
    @RequiredArgsConstructor
    class ErrorResponseImpl implements ErrorResponse {
        private final String code;
        private final String message;
        private final HttpStatus httpStatus;
    }
}

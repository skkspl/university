package org.library.exception;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

public interface ErrorResponse {

    @Schema(description = "Код ошибки", example = "app-001")
    String getCode();

    @Schema(description = "Сообщение ошибки", example = "Ошибка валидации")
    String getMessage();

    @Schema(description = "HTTP статус ошибки", example = "422")
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
    @Schema(name = "ErrorResponse", description = "Сущность, описывающая ошибку")
    class ErrorResponseImpl implements ErrorResponse {
        private final String code;
        private final String message;
        private final HttpStatus httpStatus;
    }
}

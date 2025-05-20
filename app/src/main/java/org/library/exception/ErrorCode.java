package org.library.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode implements ErrorResponse {
    VALIDATION_ERROR("app-001", "Ошибка валидации", HttpStatus.UNPROCESSABLE_ENTITY),

    USER_BY_ID_NOT_FOUND("user-001", "Пользователь c [id=%d] не найден", HttpStatus.NOT_FOUND),
    USER_BY_EMAIL_NOT_FOUND("user-002", "Пользователь c [email=%s] не найден", HttpStatus.NOT_FOUND);

    private final String code;
    private final String message;
    private final HttpStatus httpStatus;
}

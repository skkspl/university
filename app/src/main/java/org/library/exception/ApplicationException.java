package org.library.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public class ApplicationException extends RuntimeException {
    private final String code;
    private final String message;
    private final HttpStatus httpStatus;
}

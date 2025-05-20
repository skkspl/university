package org.library.advice;

import org.library.exception.ApplicationException;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomControllerAdvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ApplicationException.class)
    public ProblemDetail handleApplicationException(ApplicationException e) {
        var problemDetail = ProblemDetail.forStatus(e.getHttpStatus().value());
        problemDetail.setTitle(e.getCode());
        problemDetail.setDetail(e.getMessage());
        return problemDetail;
    }
}

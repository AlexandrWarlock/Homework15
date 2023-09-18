package com.alexandrwarlock.calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class DivideException extends IllegalArgumentException {
    public DivideException() {
    }

    public DivideException(String s) {
        super(s);
    }

    public DivideException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivideException(Throwable cause) {
        super(cause);
    }
}

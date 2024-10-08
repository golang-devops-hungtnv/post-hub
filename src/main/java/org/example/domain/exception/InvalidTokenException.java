package org.example.domain.exception;

import lombok.NonNull;
import org.example.domain.BaseInternalException;

public class InvalidTokenException extends BaseInternalException {
    private static final String CODE = "CODE.INT.EX.001";
    private static final String MESSAGE = "The jwt token is invalid";

    public InvalidTokenException(@NonNull String message, @NonNull String code) {
        super(message, code);
    }

    public InvalidTokenException() {
        super(MESSAGE, CODE);
    }

    public InvalidTokenException(@NonNull String message) {
        super(message, CODE);
    }
}
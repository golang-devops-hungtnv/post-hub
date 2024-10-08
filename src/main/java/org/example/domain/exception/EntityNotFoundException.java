package org.example.domain.exception;

import lombok.NonNull;
import org.example.domain.BaseInternalException;

public class EntityNotFoundException extends BaseInternalException {
    private static final String CODE = "CODE.INT.EX.003";
    private static final String MESSAGE = "The entity could not be found";

    public EntityNotFoundException(@NonNull String message, @NonNull String code) {
        super(message, code);
    }

    public EntityNotFoundException() {
        super(MESSAGE, CODE);
    }

    public EntityNotFoundException(@NonNull String message) {
        super(message, CODE);
    }
}
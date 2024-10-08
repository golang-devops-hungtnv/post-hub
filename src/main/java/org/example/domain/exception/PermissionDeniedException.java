package org.example.domain.exception;

import lombok.NonNull;
import org.example.domain.BaseInternalException;

public class PermissionDeniedException extends BaseInternalException {
    private static final String CODE = "CODE.INT.EX.002";
    private static final String MESSAGE =
            "The current user credential does not have the permission to access resources";

    public PermissionDeniedException(@NonNull String message, @NonNull String code) {
        super(message, code);
    }

    public PermissionDeniedException() {
        super(MESSAGE, CODE);
    }

    public PermissionDeniedException(@NonNull String message) {
        super(message, CODE);
    }
}
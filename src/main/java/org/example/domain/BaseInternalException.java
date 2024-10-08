package org.example.domain;


import lombok.NonNull;
public class BaseInternalException extends Exception {
    private @NonNull final String code;

    public BaseInternalException(@NonNull final String message, @NonNull final String code) {
        super(message);
        this.code = code;
    }

    public @NonNull String getCode() {
        return this.code;
    }

    public boolean rollbackTransactionOnExceptionThrow() {
        return Boolean.TRUE;
    }
}

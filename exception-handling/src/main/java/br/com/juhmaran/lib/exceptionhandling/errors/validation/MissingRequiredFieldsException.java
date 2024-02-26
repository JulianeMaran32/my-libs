package br.com.juhmaran.lib.exceptionhandling.errors.validation;

public class MissingRequiredFieldsException extends RuntimeException {
    public MissingRequiredFieldsException() {
    }

    public MissingRequiredFieldsException(String message) {
        super(message);
    }

    public MissingRequiredFieldsException(String message, Throwable cause) {
        super(message, cause);
    }

    public MissingRequiredFieldsException(Throwable cause) {
        super(cause);
    }
}

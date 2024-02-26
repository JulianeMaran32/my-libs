package br.com.juhmaran.lib.exceptionhandling.errors.validation;

public class PasswordInvalidFormatException extends RuntimeException {
    public PasswordInvalidFormatException() {
    }

    public PasswordInvalidFormatException(String message) {
        super(message);
    }

    public PasswordInvalidFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordInvalidFormatException(Throwable cause) {
        super(cause);
    }
}

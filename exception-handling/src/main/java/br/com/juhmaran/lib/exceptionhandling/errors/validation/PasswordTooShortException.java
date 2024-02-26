package br.com.juhmaran.lib.exceptionhandling.errors.validation;

public class PasswordTooShortException extends RuntimeException {
    public PasswordTooShortException() {
    }

    public PasswordTooShortException(String message) {
        super(message);
    }

    public PasswordTooShortException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordTooShortException(Throwable cause) {
        super(cause);
    }
}

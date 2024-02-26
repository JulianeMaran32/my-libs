package br.com.juhmaran.lib.exceptionhandling.errors.validation;

public class InvalidCnpjException extends RuntimeException {
    public InvalidCnpjException() {
    }

    public InvalidCnpjException(String message) {
        super(message);
    }

    public InvalidCnpjException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCnpjException(Throwable cause) {
        super(cause);
    }
}

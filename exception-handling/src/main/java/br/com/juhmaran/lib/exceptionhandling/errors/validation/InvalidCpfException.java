package br.com.juhmaran.lib.exceptionhandling.errors.validation;

public class InvalidCpfException extends RuntimeException {
    public InvalidCpfException() {
    }

    public InvalidCpfException(String message) {
        super(message);
    }

    public InvalidCpfException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCpfException(Throwable cause) {
        super(cause);
    }
}

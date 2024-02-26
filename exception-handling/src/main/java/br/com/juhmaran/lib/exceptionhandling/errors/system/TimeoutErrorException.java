package br.com.juhmaran.lib.exceptionhandling.errors.system;

public class TimeoutErrorException extends RuntimeException {

    public TimeoutErrorException() {
    }

    public TimeoutErrorException(String message) {
        super(message);
    }

    public TimeoutErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public TimeoutErrorException(Throwable cause) {
        super(cause);
    }
}

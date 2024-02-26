package br.com.juhmaran.lib.exceptionhandling.errors.system;

public class DatabaseErrorException extends RuntimeException {

    public DatabaseErrorException() {
    }

    public DatabaseErrorException(String message) {
        super(message);
    }

    public DatabaseErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public DatabaseErrorException(Throwable cause) {
        super(cause);
    }
}

package br.com.juhmaran.lib.exceptionhandling.errors.validation;

public class CaptchaInvalidException extends RuntimeException {
    public CaptchaInvalidException() {
    }

    public CaptchaInvalidException(String message) {
        super(message);
    }

    public CaptchaInvalidException(String message, Throwable cause) {
        super(message, cause);
    }

    public CaptchaInvalidException(Throwable cause) {
        super(cause);
    }
}

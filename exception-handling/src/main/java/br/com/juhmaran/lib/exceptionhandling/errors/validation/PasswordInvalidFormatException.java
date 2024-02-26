package br.com.juhmaran.lib.exceptionhandling.errors.validation;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;

public class PasswordInvalidFormatException extends CustomException {
    public PasswordInvalidFormatException() {
        super(ErrorStatus.PASSWORD_INVALID_FORMAT);
    }

}

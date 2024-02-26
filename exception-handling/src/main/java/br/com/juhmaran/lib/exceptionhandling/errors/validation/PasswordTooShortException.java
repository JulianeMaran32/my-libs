package br.com.juhmaran.lib.exceptionhandling.errors.validation;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;

public class PasswordTooShortException extends CustomException {
    public PasswordTooShortException() {
        super(ErrorStatus.PASSWORD_TOO_SHORT);
    }

}

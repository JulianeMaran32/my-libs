package br.com.juhmaran.lib.exceptionhandling.errors.business;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;

public class PasswordMismatchException extends CustomException {
    public PasswordMismatchException() {
        super(ErrorStatus.PASSWORD_MISMATCH);
    }

}

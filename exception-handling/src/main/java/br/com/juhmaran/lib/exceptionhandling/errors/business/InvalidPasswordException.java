package br.com.juhmaran.lib.exceptionhandling.errors.business;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;

public class InvalidPasswordException extends CustomException {
    public InvalidPasswordException() {
        super(ErrorStatus.INVALID_PASSWORD);
    }

}

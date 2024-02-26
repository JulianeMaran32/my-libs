package br.com.juhmaran.lib.exceptionhandling.errors.validation;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;

public class InvalidEmailException extends CustomException {
    public InvalidEmailException() {
        super(ErrorStatus.INVALID_EMAIL);
    }

}

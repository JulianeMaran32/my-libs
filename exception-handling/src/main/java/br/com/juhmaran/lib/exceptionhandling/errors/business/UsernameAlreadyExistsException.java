package br.com.juhmaran.lib.exceptionhandling.errors.business;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;

public class UsernameAlreadyExistsException extends CustomException {
    public UsernameAlreadyExistsException() {
        super(ErrorStatus.EMAIL_ALREADY_EXISTS);
    }

}
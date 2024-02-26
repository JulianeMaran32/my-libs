package br.com.juhmaran.lib.exceptionhandling.errors.business;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;

public class UserAlreadyExistsException extends CustomException {
    public UserAlreadyExistsException() {
        super(ErrorStatus.USER_ALREADY_EXISTS);
    }

}

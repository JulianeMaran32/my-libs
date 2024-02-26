package br.com.juhmaran.lib.exceptionhandling.errors.security;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;

public class ForbiddenAccessException extends CustomException {
    public ForbiddenAccessException() {
        super(ErrorStatus.FORBIDDEN_ACCESS);
    }

}

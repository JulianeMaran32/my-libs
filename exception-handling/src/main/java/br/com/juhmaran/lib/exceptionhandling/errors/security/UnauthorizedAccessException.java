package br.com.juhmaran.lib.exceptionhandling.errors.security;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;

public class UnauthorizedAccessException extends CustomException {
    public UnauthorizedAccessException() {
        super(ErrorStatus.UNAUTHORIZED_ACCESS);
    }

}

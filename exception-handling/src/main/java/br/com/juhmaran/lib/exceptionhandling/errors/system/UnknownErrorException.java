package br.com.juhmaran.lib.exceptionhandling.errors.system;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;

public class UnknownErrorException extends CustomException {

    public UnknownErrorException() {
        super(ErrorStatus.UNKNOWN_ERROR);
    }

}

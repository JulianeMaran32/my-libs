package br.com.juhmaran.lib.exceptionhandling.errors.system;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;

public class TimeoutErrorException extends CustomException {

    public TimeoutErrorException() {
        super(ErrorStatus.TIMEOUT_ERROR);
    }

}

package br.com.juhmaran.lib.exceptionhandling.errors.system;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;

public class InternalServerErrorException extends CustomException {

    public InternalServerErrorException() {
        super(ErrorStatus.INTERNAL_SERVER_ERROR);
    }

}

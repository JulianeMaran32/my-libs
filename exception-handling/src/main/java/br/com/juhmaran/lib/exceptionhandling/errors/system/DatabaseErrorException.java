package br.com.juhmaran.lib.exceptionhandling.errors.system;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;

public class DatabaseErrorException extends CustomException {

    public DatabaseErrorException() {
        super(ErrorStatus.DATABASE_ERROR);
    }

}

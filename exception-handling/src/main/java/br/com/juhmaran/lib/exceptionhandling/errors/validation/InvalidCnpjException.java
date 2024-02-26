package br.com.juhmaran.lib.exceptionhandling.errors.validation;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;

public class InvalidCnpjException extends CustomException {
    public InvalidCnpjException() {
        super(ErrorStatus.INVALID_CNPJ);
    }

}

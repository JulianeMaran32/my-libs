package br.com.juhmaran.lib.exceptionhandling.errors.validation;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;

public class InvalidCpfException extends CustomException {
    public InvalidCpfException() {
        super(ErrorStatus.INVALID_CPF);
    }

}

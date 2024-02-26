package br.com.juhmaran.lib.exceptionhandling.errors.validation;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;

public class MissingRequiredFieldsException extends CustomException {
    public MissingRequiredFieldsException() {
        super(ErrorStatus.MISSING_REQUIRED_FIELDS);
    }

}

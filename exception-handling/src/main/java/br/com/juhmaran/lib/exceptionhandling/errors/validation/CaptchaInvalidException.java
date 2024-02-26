package br.com.juhmaran.lib.exceptionhandling.errors.validation;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;

public class CaptchaInvalidException extends CustomException {
    public CaptchaInvalidException() {
        super(ErrorStatus.CAPTCHA_INVALID);
    }

}

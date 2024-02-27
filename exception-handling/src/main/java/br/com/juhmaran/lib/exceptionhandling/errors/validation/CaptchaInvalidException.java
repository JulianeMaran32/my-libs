package br.com.juhmaran.lib.exceptionhandling.errors.validation;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe padrão para a exceção CaptchaInvalidException
 * <p>
 * Indica que o captcha informado é inválido.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class CaptchaInvalidException extends CustomException {
    public CaptchaInvalidException() {
        super(ErrorStatus.CAPTCHA_INVALID);
        log.error("Exceção CaptchaInvalidException lançada: Captcha inválido.");
    }

}

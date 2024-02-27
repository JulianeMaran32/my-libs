package br.com.juhmaran.lib.exceptionhandling.errors.validation;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe padrão para a exceção PasswordTooShortException
 * <p>
 * Indica que a senha informada é muito curta.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class PasswordTooShortException extends CustomException {
    public PasswordTooShortException() {
        super(ErrorStatus.PASSWORD_TOO_SHORT);
        log.error("Exceção PasswordTooShortException lançada: Senha muito curta.");
    }

}

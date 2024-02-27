package br.com.juhmaran.lib.exceptionhandling.errors.validation;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe padrão para a exceção PasswordInvalidFormatException
 * <p>
 * Indica que a senha informada possui formato inválido.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class PasswordInvalidFormatException extends CustomException {
    public PasswordInvalidFormatException() {
        super(ErrorStatus.PASSWORD_INVALID_FORMAT);
        log.error("Exceção PasswordInvalidFormatException lançada: Senha com formato inválido.");
    }

}

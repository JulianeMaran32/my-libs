package br.com.juhmaran.lib.exceptionhandling.errors.business;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe responsável por lançar a exceção InvalidPasswordException.
 * <p>
 * Indica que a senha está inválida.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class InvalidPasswordException extends CustomException {
    public InvalidPasswordException() {
        super(ErrorStatus.INVALID_PASSWORD);
        log.error("Exceção InvalidPasswordException lançada: Senha inválida!");
    }

}

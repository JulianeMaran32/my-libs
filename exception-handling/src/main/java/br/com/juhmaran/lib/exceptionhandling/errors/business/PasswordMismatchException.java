package br.com.juhmaran.lib.exceptionhandling.errors.business;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe responsável por lançar a exceção PasswordMismatchException.
 * <p>
 * Indica que as senhas não conferem, ou seja, são diferentes.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class PasswordMismatchException extends CustomException {
    public PasswordMismatchException() {
        super(ErrorStatus.PASSWORD_MISMATCH);
        log.error("Exceção PasswordMismatchException lançada: Senha não confere!");
    }

}

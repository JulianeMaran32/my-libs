package br.com.juhmaran.lib.exceptionhandling.errors.business;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe responsável por lançar a exceção UsernameAlreadyExistsException para USERNAME já cadastrado.
 * <p>
 * Indica que o nome de usuário já existe.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class UsernameAlreadyExistsException extends CustomException {
    public UsernameAlreadyExistsException() {
        super(ErrorStatus.USERNAME_ALREADY_EXISTS);
        log.error("Exceção UsernameAlreadyExistsException lançada: Nome de usuário já existente.");
    }

}

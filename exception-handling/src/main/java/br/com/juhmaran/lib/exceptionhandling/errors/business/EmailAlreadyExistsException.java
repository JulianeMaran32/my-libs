package br.com.juhmaran.lib.exceptionhandling.errors.business;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe responsável por lançar a exceção EmailAlreadyExistsException, para EMAIL já cadastrados.
 * <p>
 * Indica que o email já está cadastrado.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class EmailAlreadyExistsException extends CustomException {
    public EmailAlreadyExistsException() {
        super(ErrorStatus.EMAIL_ALREADY_EXISTS);
        log.error("Exceção EmailAlreadyExistsException lançada: E-mail já cadastrado!");
    }

}

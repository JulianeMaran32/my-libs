package br.com.juhmaran.lib.exceptionhandling.errors.validation;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe padrão para a exceção InvalidEmailException
 * <p>
 * Indica que o e-mail informado é inválido.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class InvalidEmailException extends CustomException {
    public InvalidEmailException() {
        super(ErrorStatus.INVALID_EMAIL);
        log.error("Exceção InvalidEmailException lançada: E-mail inválido.");
    }

}

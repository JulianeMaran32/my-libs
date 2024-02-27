package br.com.juhmaran.lib.exceptionhandling.errors.validation;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe padrão para a exceção InvalidCpfException
 * <p>
 * Indica que o CPF informado é inválido.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class InvalidCpfException extends CustomException {
    public InvalidCpfException() {
        super(ErrorStatus.INVALID_CPF);
        log.error("Exceção InvalidCpfException lançada: CPF inválido.");
    }

}

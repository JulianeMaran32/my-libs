package br.com.juhmaran.lib.exceptionhandling.errors.validation;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe padrão para a exceção InvalidCnpjException
 * <p>
 * Indica que o CNPJ informado é inválido.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class InvalidCnpjException extends CustomException {
    public InvalidCnpjException() {
        super(ErrorStatus.INVALID_CNPJ);
        log.error("Exceção InvalidCnpjException lançada: CNPJ inválido.");
    }

}

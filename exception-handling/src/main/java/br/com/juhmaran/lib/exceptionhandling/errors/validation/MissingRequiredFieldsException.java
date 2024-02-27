package br.com.juhmaran.lib.exceptionhandling.errors.validation;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe padrão para a exceção MissingRequiredFieldsException
 * <p>
 * Indica que um ou mais campos obrigatórios não foram preenchidos
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class MissingRequiredFieldsException extends CustomException {
    public MissingRequiredFieldsException() {
        super(ErrorStatus.MISSING_REQUIRED_FIELDS);
        log.error("Exceção MissingRequiredFieldsException lançada: Dados incompletos.");
    }

}

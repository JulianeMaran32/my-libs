package br.com.juhmaran.lib.exceptionhandling.errors.generic;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe padrão para a exceção GenericNotFoundException
 * <p>
 * Indica que a solicitação não foi encontrada - para utilizar em casos genéricos.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class GenericNotFoundException extends CustomException {
    public GenericNotFoundException() {
        super(ErrorStatus.GENERIC_NOT_FOUND);
        log.error("Exceção GenericNotFoundException lançada: Não foi encontrado.");
    }

}

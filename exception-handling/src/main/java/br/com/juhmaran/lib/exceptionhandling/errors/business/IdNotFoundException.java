package br.com.juhmaran.lib.exceptionhandling.errors.business;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe responsável por lançar a exceção IdNotFoundException
 * <p>
 * Indica que o ID não foi encontrado
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class IdNotFoundException extends CustomException {
    public IdNotFoundException() {
        super(ErrorStatus.ID_NOT_FOUND);
        log.error("Exceção IdNotFoundException lançada: ID informado não foi encontrado.");
    }

}

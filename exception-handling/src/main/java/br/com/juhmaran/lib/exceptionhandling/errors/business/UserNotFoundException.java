package br.com.juhmaran.lib.exceptionhandling.errors.business;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe responsável por lançar a exceção UserNotFoundException
 * <p>
 * Indica que o Usuário não foi encontrado
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class UserNotFoundException extends CustomException {
    public UserNotFoundException() {
        super(ErrorStatus.USER_NOT_FOUND);
        log.error("Exceção UserNotFoundException lançada: Usuário informado não foi encontrado.");
    }

}

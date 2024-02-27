package br.com.juhmaran.lib.exceptionhandling.errors.system;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe padrão para a exceção UnknownErrorException
 * <p>
 * Indica que ocorreu um erro desconhecido no servidor.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class UnknownErrorException extends CustomException {

    public UnknownErrorException() {
        super(ErrorStatus.UNKNOWN_ERROR);
        log.error("Exceção UnknownErrorException lançada: Erro desconhecido no servidor.");
    }

}

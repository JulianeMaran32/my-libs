package br.com.juhmaran.lib.exceptionhandling.errors.system;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe padrão para a exceção InternalServerErrorException
 * <p>
 * Indica que ocorreu um erro interno no servidor.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class InternalServerErrorException extends CustomException {

    public InternalServerErrorException() {
        super(ErrorStatus.INTERNAL_SERVER_ERROR);
        log.error("Exceção InternalServerErrorException lançada: Erro interno no servidor.");
    }

}

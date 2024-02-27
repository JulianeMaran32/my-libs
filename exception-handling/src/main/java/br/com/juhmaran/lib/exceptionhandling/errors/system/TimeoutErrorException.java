package br.com.juhmaran.lib.exceptionhandling.errors.system;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe padrão para a exceção TimeoutErrorException
 * <p>
 * Indica que o tempo limite da requisição foi excedido.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class TimeoutErrorException extends CustomException {

    public TimeoutErrorException() {
        super(ErrorStatus.TIMEOUT_ERROR);
        log.error("Exceção TimeoutErrorException lançada: Tempo limite excedido.");
    }

}

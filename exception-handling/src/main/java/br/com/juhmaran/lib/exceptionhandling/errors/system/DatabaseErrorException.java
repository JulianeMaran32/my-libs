package br.com.juhmaran.lib.exceptionhandling.errors.system;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe padrão para a exceção DatabaseErrorException
 * <p>
 * Indica que ocorreu um erro no banco de dados.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class DatabaseErrorException extends CustomException {

    public DatabaseErrorException() {
        super(ErrorStatus.DATABASE_ERROR);
        log.error("Exceção DatabaseErrorException lançada: Erro no banco de dados.");
    }

}

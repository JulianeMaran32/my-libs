package br.com.juhmaran.lib.exceptionhandling.errors.security;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe padrão para a exceção UnauthorizedAccessException
 * <p>
 * Indica que o usuário não está autenticado e não possui permissão para acessar o recurso.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class UnauthorizedAccessException extends CustomException {
    public UnauthorizedAccessException() {
        super(ErrorStatus.UNAUTHORIZED_ACCESS);
        log.error("Exceção UnauthorizedAccessException lançada: Acesso não autorizado.");
    }

}

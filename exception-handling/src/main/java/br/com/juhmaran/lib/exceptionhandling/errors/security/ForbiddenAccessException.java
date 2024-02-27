package br.com.juhmaran.lib.exceptionhandling.errors.security;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe padrão para a exceção ForbiddenAccessException
 * <p>
 * Indica que o usuário não tem permissão para acessar o recurso.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class ForbiddenAccessException extends CustomException {
    public ForbiddenAccessException() {
        super(ErrorStatus.FORBIDDEN_ACCESS);
        log.error("Exceção ForbiddenAccessException lançada: Acesso negado.");
    }

}

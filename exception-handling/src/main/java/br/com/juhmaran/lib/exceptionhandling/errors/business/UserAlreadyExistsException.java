package br.com.juhmaran.lib.exceptionhandling.errors.business;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe responsável por lançar a exceção UserAlreadyExistsException.
 * <p>
 * Indica que o usuário já existe na base de dados.
 * <p>
 * Caso a aplicação utilize um único campo para Login (email ou username ou número de documento), deve utilizar esta
 * exceção para indicar que o suário já está cadastrado, independente do campo utilizado para login.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class UserAlreadyExistsException extends CustomException {
    public UserAlreadyExistsException() {
        super(ErrorStatus.USER_ALREADY_EXISTS);
        log.error("Exceção UserAlreadyExistsException lançada: Usuário ou Email ou Número de Documento já cadastrado.");
    }

}

package br.com.juhmaran.lib.exceptionhandling.errors.business;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe responsável por lançar a exceção UsernameAlreadyExistsException para CPF ou CNPJ já cadastrado.
 * <p>
 * Indica que o nome de usuário já existe.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class DocumentNumberAlreadyExistsException extends CustomException {
    public DocumentNumberAlreadyExistsException() {
        super(ErrorStatus.EMAIL_ALREADY_EXISTS);
        log.error("Exceção DocumentNumberAlreadyExistsException lançada: Número de documento já existente.");
    }

}

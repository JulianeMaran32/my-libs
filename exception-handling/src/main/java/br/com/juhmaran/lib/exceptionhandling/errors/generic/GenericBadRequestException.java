package br.com.juhmaran.lib.exceptionhandling.errors.generic;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe padrão para a exceção GenericBadRequestException
 * <p>
 * Indica que a solicitação é inválida - utilizada para casos genéricos.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class GenericBadRequestException extends CustomException {
	public GenericBadRequestException() {
		super(ErrorStatus.GENERIC_NOT_FOUND);
		log.error("Exceção GenericBadRequestException lançada: Solicitação inválida.");
	}

}

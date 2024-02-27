package br.com.juhmaran.lib.exceptionhandling.errors;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import lombok.Builder;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serial;

/**
 * Esta classe representa uma exceção personalizada que pode ser utilizada em sua aplicação. Ela fornece informações
 * sobre o status do erro e, principalmente, uma mensagem e causa.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Getter
@Builder
public class CustomException extends RuntimeException {

    private static final Logger logger = LoggerFactory.getLogger(CustomException.class);

    @Serial
    private static final long serialVersionUID = 6600416376471337779L;

    private final ErrorStatus errorStatus;

    public CustomException(ErrorStatus errorStatus) {
        this.errorStatus = errorStatus;
        logger.warn("Ocorreu uma exceção CustomException com o código de status: {}", errorStatus.getCode());
    }

    public CustomException(String message, ErrorStatus errorStatus) {
        super(message);
        this.errorStatus = errorStatus;
        logger.error("Exceção CustomException lançada: {} - {}", message, errorStatus);
    }

    public CustomException(String message, Throwable cause, ErrorStatus errorStatus) {
        super(message, cause);
        this.errorStatus = errorStatus;
        logger.error("Exceção CustomException lançada: {} - {} - Causa: {}", message, errorStatus, cause);
    }

    public CustomException(Throwable cause, ErrorStatus errorStatus) {
        super(cause);
        this.errorStatus = errorStatus;
        logger.error("Exceção CustomException lançada: {} - Causa: {}", errorStatus, cause);
    }

}

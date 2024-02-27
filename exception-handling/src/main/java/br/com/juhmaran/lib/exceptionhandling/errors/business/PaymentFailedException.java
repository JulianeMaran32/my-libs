package br.com.juhmaran.lib.exceptionhandling.errors.business;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * Classe responsável por lançar a exceção PaymentFailedException.
 * <p>
 * Indica que o pagamento falhou.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
public class PaymentFailedException extends CustomException {
    public PaymentFailedException() {
        super(ErrorStatus.PAYMENT_FAILED);
        log.error("Exceção PaymentFailedException lançada: Falha no pagamento.");
    }

}

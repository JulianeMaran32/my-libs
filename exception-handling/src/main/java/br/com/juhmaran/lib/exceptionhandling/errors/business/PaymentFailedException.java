package br.com.juhmaran.lib.exceptionhandling.errors.business;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;

public class PaymentFailedException extends CustomException {
    public PaymentFailedException() {
        super(ErrorStatus.PAYMENT_FAILED);
    }

}

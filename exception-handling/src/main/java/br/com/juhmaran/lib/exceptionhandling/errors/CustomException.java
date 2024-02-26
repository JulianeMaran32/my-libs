package br.com.juhmaran.lib.exceptionhandling.errors;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class CustomException extends RuntimeException {

    private final ErrorStatus errorStatus;

}

package br.com.juhmaran.lib.exceptionhandling.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorResponse {

    private Integer code; // ex.: 400
    private String status; // ex.: Bad Request
    private String message; // ex.: Erro ao enviar a requisição

}

package br.com.juhmaran.lib.exceptionhandling.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

    private Integer code;
    private String status;
    private String message;

}

package br.com.juhmaran.lib.exceptionhandling.handler;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorCode;
import br.com.juhmaran.lib.exceptionhandling.dto.ErrorResponse;
import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.system.DatabaseErrorException;
import br.com.juhmaran.lib.exceptionhandling.errors.system.InternalServerErrorException;
import br.com.juhmaran.lib.exceptionhandling.errors.system.UnknownErrorException;
import br.com.juhmaran.lib.exceptionhandling.errors.system.TimeoutErrorException;
import br.com.juhmaran.lib.exceptionhandling.errors.validation.InvalidEmailException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({Exception.class})
    public ResponseEntity<ErrorResponse> handleException(Exception ex) {

        var errorCode = ErrorCode.INTERNAL_SERVER_ERROR;

        if (ex instanceof InternalServerErrorException) {
            errorCode = ErrorCode.BAD_REQUEST;
        } else if (ex instanceof UnknownErrorException) {
            errorCode = ErrorCode.NOT_FOUND;
        } else if (ex instanceof DatabaseErrorException) {
            errorCode = ErrorCode.FORBIDDEN;
        } else if (ex instanceof TimeoutErrorException) {
            errorCode = ErrorCode.UNAUTHORIZED;
        }

        String message = ex.getMessage();
        if (message == null || message.isEmpty()) {
            message = "Ocorreu um erro inesperado.";
        }

        var errorResponse = ErrorResponse.builder()
                .code(errorCode.getCode())
                .status(errorCode.getStatus())
                .message(message)
                .build();

        return ResponseEntity.status(errorCode.getCode())
                .body(errorResponse);

    }

    private ResponseEntity<ErrorResponse> buildErrorResponse(ErrorStatus errorStatus, Exception ex) {
        ErrorResponse errorResponse = ErrorResponse.builder()
                .code(errorStatus.getCode())
                .status(errorStatus.getStatus())
                .message(errorStatus.getMesssage())
                .build();

        return new ResponseEntity<>(errorResponse, HttpStatus.valueOf(errorStatus.getCode()));
    }

    @ExceptionHandler(value = {InvalidEmailException.class})
    public ResponseEntity<ErrorResponse> handleInvalidEmail(InvalidEmailException ex) {
        return buildErrorResponse(ErrorStatus.INVALID_EMAIL, ex);
    }




}

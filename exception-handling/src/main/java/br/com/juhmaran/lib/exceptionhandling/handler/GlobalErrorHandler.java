package br.com.juhmaran.lib.exceptionhandling.handler;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorCode;
import br.com.juhmaran.lib.exceptionhandling.dto.ErrorResponse;
import br.com.juhmaran.lib.exceptionhandling.runtimes.BadRequestException;
import br.com.juhmaran.lib.exceptionhandling.runtimes.ForbiddenException;
import br.com.juhmaran.lib.exceptionhandling.runtimes.NotFoundException;
import br.com.juhmaran.lib.exceptionhandling.runtimes.UnauthorizedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalErrorHandler {

    @ExceptionHandler({Exception.class})
    public ResponseEntity<ErrorResponse> handleException(Exception ex) {

        ErrorCode errorCode = ErrorCode.INTERNAL_SERVER_ERROR;

        if (ex instanceof BadRequestException) {
            errorCode = ErrorCode.BAD_REQUEST;
        } else if (ex instanceof NotFoundException) {
            errorCode = ErrorCode.NOT_FOUND;
        } else if (ex instanceof ForbiddenException) {
            errorCode = ErrorCode.FORBIDDEN;
        } else if (ex instanceof UnauthorizedException) {
            errorCode = ErrorCode.UNAUTHORIZED;
        }

        String message = ex.getMessage();
        if (message == null || message.isEmpty()) {
            message = "Ocorreu um erro inesperado.";
        }

        ErrorResponse errorResponse = new ErrorResponse(errorCode.getCode(), errorCode.getStatus(), message);

        return ResponseEntity.status(errorCode.getCode()).body(errorResponse);

    }

}

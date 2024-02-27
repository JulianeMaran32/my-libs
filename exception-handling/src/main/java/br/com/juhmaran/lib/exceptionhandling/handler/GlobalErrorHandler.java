package br.com.juhmaran.lib.exceptionhandling.handler;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorResponse;
import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import br.com.juhmaran.lib.exceptionhandling.errors.business.*;
import br.com.juhmaran.lib.exceptionhandling.errors.generic.GenericBadRequestException;
import br.com.juhmaran.lib.exceptionhandling.errors.generic.GenericNotFoundException;
import br.com.juhmaran.lib.exceptionhandling.errors.security.ForbiddenAccessException;
import br.com.juhmaran.lib.exceptionhandling.errors.security.UnauthorizedAccessException;
import br.com.juhmaran.lib.exceptionhandling.errors.system.DatabaseErrorException;
import br.com.juhmaran.lib.exceptionhandling.errors.system.InternalServerErrorException;
import br.com.juhmaran.lib.exceptionhandling.errors.system.TimeoutErrorException;
import br.com.juhmaran.lib.exceptionhandling.errors.system.UnknownErrorException;
import br.com.juhmaran.lib.exceptionhandling.errors.validation.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Esta classe intercepta exceções lançadas em controladores da API e mapeia cada tipo de exceção para uma resposta HTTP
 * apropriada com código de status e mensagem de erro.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Slf4j
@RestControllerAdvice
public class GlobalErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = CustomException.class)
    public ResponseEntity<ErrorResponse> handleCustomExceptions(CustomException ex) {
        log.error("Exceção CustomException capturada: {}", ex.getMessage(), ex);
        return buildErrorResponse(ex);
    }

    @ExceptionHandler(value = {
            DocumentNumberAlreadyExistsException.class,
            EmailAlreadyExistsException.class,
            IdNotFoundException.class,
            InvalidPasswordException.class,
            PasswordMismatchException.class,
            UserAlreadyExistsException.class,
            UsernameAlreadyExistsException.class,
            UserNotFoundException.class
    })
    public ResponseEntity<ErrorResponse> handleBusinessExceptions(CustomException ex) {
        log.error("Exceção de negócio capturada: {}", ex.getMessage());
        return buildErrorResponse(ex);
    }

    @ExceptionHandler(value = {
            ForbiddenAccessException.class,
            UnauthorizedAccessException.class
    })
    public ResponseEntity<ErrorResponse> handleSecurityExceptions(CustomException ex) {
        log.error("Exceção de segurança capturada: {}", ex.getMessage());
        return buildErrorResponse(ex);
    }

    @ExceptionHandler(value = {
            DatabaseErrorException.class,
            InternalServerErrorException.class,
            TimeoutErrorException.class,
            UnknownErrorException.class
    })
    public ResponseEntity<ErrorResponse> handleSystemExceptions(CustomException ex) {
        log.error("Exceção de sistema capturada: {}", ex.getMessage());
        return buildErrorResponse(ex);
    }

    @ExceptionHandler(value = {
            CaptchaInvalidException.class,
            InvalidCnpjException.class,
            InvalidCpfException.class,
            InvalidEmailException.class,
            MissingRequiredFieldsException.class,
            PasswordInvalidFormatException.class,
            PasswordTooShortException.class
    })
    public ResponseEntity<ErrorResponse> handleValidationExceptions(CustomException ex) {
        log.error("Exceção de validação capturada: {}", ex.getMessage());
        return buildErrorResponse(ex);
    }

    @ExceptionHandler(value = {
            GenericBadRequestException.class,
            GenericNotFoundException.class
    })
    public ResponseEntity<ErrorResponse> handleGenericExceptions(CustomException ex) {
        log.error("Exceção de genérica capturada: {}", ex.getMessage());
        return buildErrorResponse(ex);
    }

    private ResponseEntity<ErrorResponse> buildErrorResponse(CustomException ex) {
        ErrorStatus errorStatus = ex.getErrorStatus();
        return ResponseEntity.status(errorStatus.getCode())
                .body(ErrorResponse.builder()
                        .code(errorStatus.getCode())
                        .status(errorStatus.getStatus())
                        .message(errorStatus.getMessage())
                        .build());
    }

}

package br.com.juhmaran.lib.exceptionhandling.handler;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorResponse;
import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import br.com.juhmaran.lib.exceptionhandling.errors.business.*;
import br.com.juhmaran.lib.exceptionhandling.errors.security.ForbiddenAccessException;
import br.com.juhmaran.lib.exceptionhandling.errors.security.UnauthorizedAccessException;
import br.com.juhmaran.lib.exceptionhandling.errors.system.DatabaseErrorException;
import br.com.juhmaran.lib.exceptionhandling.errors.system.InternalServerErrorException;
import br.com.juhmaran.lib.exceptionhandling.errors.system.TimeoutErrorException;
import br.com.juhmaran.lib.exceptionhandling.errors.system.UnknownErrorException;
import br.com.juhmaran.lib.exceptionhandling.errors.validation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = CustomException.class)
    public ResponseEntity<ErrorResponse> handleCustomExceptions(CustomException ex) {
        return buildErrorResponse(ex); // Use a common helper method
    }

    @ExceptionHandler(value = {
            EmailAlreadyExistsException.class,
            InvalidPasswordException.class,
            PasswordMismatchException.class,
            UserAlreadyExistsException.class,
            UsernameAlreadyExistsException.class
    })
    public ResponseEntity<ErrorResponse> handleBusinessExceptions(CustomException ex) {
        return buildErrorResponse(ex);
    }

    @ExceptionHandler(value = {
            ForbiddenAccessException.class,
            UnauthorizedAccessException.class
    })
    public ResponseEntity<ErrorResponse> handleSecurityExceptions(CustomException ex) {
        return buildErrorResponse(ex);
    }

    @ExceptionHandler(value = {
            DatabaseErrorException.class,
            InternalServerErrorException.class,
            TimeoutErrorException.class,
            UnknownErrorException.class
    })
    public ResponseEntity<ErrorResponse> handleSystemExceptions(CustomException ex) {
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

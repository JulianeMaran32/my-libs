package br.com.juhmaran.lib.exceptionhandling.handler;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorResponse;
import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import br.com.juhmaran.lib.exceptionhandling.errors.business.*;
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

    // ERRORS - BUSINESS
    @ExceptionHandler(value = EmailAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleEmailAlreadyExistsException(EmailAlreadyExistsException ex) {
        return buildErrorResponse(ex); // Use the same helper method
    }

    @ExceptionHandler(value = InvalidPasswordException.class)
    public ResponseEntity<ErrorResponse> handleInvalidPasswordException(InvalidPasswordException ex) {
        return buildErrorResponse(ex); // Use the same helper method
    }

    @ExceptionHandler(value = PasswordMismatchException.class)
    public ResponseEntity<ErrorResponse> handlePasswordMismatchException(PasswordMismatchException ex) {
        return buildErrorResponse(ex); // Use the same helper method
    }

    @ExceptionHandler(value = UserAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleUserAlreadyExistsException(UserAlreadyExistsException ex) {
        return buildErrorResponse(ex); // Use the same helper method
    }

    @ExceptionHandler(value = UsernameAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleUsernameAlreadyExistsException(UsernameAlreadyExistsException ex) {
        return buildErrorResponse(ex); // Use the same helper method
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



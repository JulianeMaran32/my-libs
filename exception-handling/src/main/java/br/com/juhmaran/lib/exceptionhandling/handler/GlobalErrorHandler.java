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

    // ERRORS - SECURITY
    @ExceptionHandler(value = ForbiddenAccessException.class)
    public ResponseEntity<ErrorResponse> handleForbiddenAccessException(ForbiddenAccessException ex) {
        return buildErrorResponse(ex); // Use the same helper method
    }

    @ExceptionHandler(value = UnauthorizedAccessException.class)
    public ResponseEntity<ErrorResponse> handleUnauthorizedAccessException(UnauthorizedAccessException ex) {
        return buildErrorResponse(ex); // Use the same helper method
    }

    // ERRORS - SYSTEM
    @ExceptionHandler(value = DatabaseErrorException.class)
    public ResponseEntity<ErrorResponse> handleDatabaseErrorException(DatabaseErrorException ex) {
        return buildErrorResponse(ex); // Use the same helper method
    }

    @ExceptionHandler(value = InternalServerErrorException.class)
    public ResponseEntity<ErrorResponse> handleInternalServerErrorException(InternalServerErrorException ex) {
        return buildErrorResponse(ex); // Use the same helper method
    }

    @ExceptionHandler(value = TimeoutErrorException.class)
    public ResponseEntity<ErrorResponse> handleTimeoutErrorException(TimeoutErrorException ex) {
        return buildErrorResponse(ex); // Use the same helper method
    }

    @ExceptionHandler(value = UnknownErrorException.class)
    public ResponseEntity<ErrorResponse> handleUnknownErrorException(UnknownErrorException ex) {
        return buildErrorResponse(ex); // Use the same helper method
    }

    // ERRORS - VALIDATION
    @ExceptionHandler(value = CaptchaInvalidException.class)
    public ResponseEntity<ErrorResponse> handleCaptchaInvalidException(CaptchaInvalidException ex) {
        return buildErrorResponse(ex); // Use the same helper method
    }

    @ExceptionHandler(value = InvalidCnpjException.class)
    public ResponseEntity<ErrorResponse> handleInvalidCnpjException(InvalidCnpjException ex) {
        return buildErrorResponse(ex); // Use the same helper method
    }

    @ExceptionHandler(value = InvalidCpfException.class)
    public ResponseEntity<ErrorResponse> handleInvalidCpfException(InvalidCpfException ex) {
        return buildErrorResponse(ex); // Use the same helper method
    }

    @ExceptionHandler(value = InvalidEmailException.class)
    public ResponseEntity<ErrorResponse> handleInvalidEmailException(InvalidEmailException ex) {
        return buildErrorResponse(ex); // Use the same helper method
    }

    @ExceptionHandler(value = MissingRequiredFieldsException.class)
    public ResponseEntity<ErrorResponse> handleMissingRequiredFieldsException(MissingRequiredFieldsException ex) {
        return buildErrorResponse(ex); // Use the same helper method
    }

    @ExceptionHandler(value = PasswordInvalidFormatException.class)
    public ResponseEntity<ErrorResponse> handlePasswordInvalidFormatException(PasswordInvalidFormatException ex) {
        return buildErrorResponse(ex); // Use the same helper method
    }

    @ExceptionHandler(value = PasswordTooShortException.class)
    public ResponseEntity<ErrorResponse> handlePasswordTooShortException(PasswordTooShortException ex) {
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



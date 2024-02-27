# Exception Handling

## Objetivo

A biblioteca de exceções foi desenvolvida para facilitar o tratamento de erros em aplicações Java. Ela fornece:

- Organização: Os erros são categorizados em diferentes tipos, facilitando a busca e correção.
- Clareza: Mensagens de erro descritivas e fáceis de entender.
- Reutilização de código: Código genérico para tratamento de erros.
- Manutenção facilitada: Adição de novos tipos de erros de forma organizada.

## Lançando Exceções

- Utilize as exceções específicas para cada tipo de erro.
- Exceções genéricas ("DataAccessException", "IntegrationException", "ApplicationException") podem ser usadas para casos
  específicos.
- Inclua mensagens de erro descritivas e fáceis de entender.

### Exemplo

```
try {
    // código que pode lançar uma exceção
} catch (InvalidEmailException ex) {
    // tratar a exceção de email inválido
} catch (DataAccessException ex) {
    // tratar a exceção de acesso a dados
}
```

## Manipulando Exceções

- Utilize o `GlobalErrorHandler` para interceptar as exceções e retornar um `ResponseEntity` com o código de erro HTTP e
  a mensagem de erro.
- O `GlobalErrorHandler` pode ser personalizado para tratar diferentes tipos de exceções de forma específica.

### Exemplo

```java

@RestControllerAdvice
public class GlobalErrorHandler {

	@ExceptionHandler(value = {
			InvalidEmailException.class,
			DataAccessException.class
	})
	public ResponseEntity<ErrorResponse> handleBadRequestExceptions(Exception ex) {
		ErrorStatus errorStatus = ((CustomException) ex).getErrorStatus();
		return ResponseEntity.status(errorStatus.getCode()).body(new ErrorResponse(errorStatus.getCode(),
				errorStatus.getStatus(), errorStatus.getMessage()));
	}

}
```

---

## Estrutura

- **erros**:
    - validation: Erros de validação de dados.
    - business: Erros de negócio.
    - security: Erros de segurança.
    - payment: Erros de pagamento.
    - integration: Erros de integração.
    - system: Erros de sistema.

| ErrorStatus                   | Classe                               | Pacote            |
|-------------------------------|--------------------------------------|-------------------|
|                               | CustomException                      | errors            | OK
| DOCUMET_NUMBER_ALREADY_EXISTS | DocumentNumberAlreadyExistsException | errors.business   | OK
| EMAIL_ALREADY_EXISTS          | EmailAlreadyExistsException          | errors.business   | OK
| ID_NOT_FOUND                  | IdNotFoundException                  | errors.business   | OK
| INVALID_PASSWORD              | InvalidPasswordException             | errors.business   | OK
| PASSWORD_MISMATCH             | PasswordMismatchException            | errors.business   | OK
| PAYMENT_FAILED                | PaymentFailedException               | errors.business   | OK
| USER_ALREADY_EXISTS           | UserAlreadyExistsException           | errors.business   | OK
| USERNAME_ALREADY_EXISTS       | UsernameAlreadyExistsException       | errors.business   | OK
| USER_NOT_FOUND                | UserNotFoundException                | errors.business   | OK
| FORBIDDEN_ACCESS              | ForbiddenAccessException             | errors.security   | OK
| UNAUTHORIZED_ACCESS           | UnauthorizedAccessException          | errors.security   | OK
| DATABASE_ERROR                | DatabaseErrorException               | errors.system     | OK
| INTERNAL_SERVER_ERROR         | InternalServerErrorException         | errors.system     | OK
| TIMEOUT_ERROR                 | TimeoutErrorException                | errors.system     | OK
| UNKNOWN_ERROR                 | UnknownErrorException                | errors.system     | OK
| CAPTCHA_INVALID               | CaptchaInvalidException              | errors.validation | OK
| INVALID_CNPJ                  | InvalidCnpjException                 | errors.validation | OK
| INVALID_CPF                   | InvalidCpfException                  | errors.validation | OK
| INVALID_EMAIL                 | InvalidEmailException                | errors.validation | OK
| MISSING_REQUIRED_FIELDS       | MissingRequiredFieldsException       | errors.validation | OK
| PASSWORD_INVALID_FORMAT       | PasswordInvalidFormatException       | errors.validation | OK
| PASSWORD_TOO_SHORT            | PasswordTooShortException            | errors.validation | OK

---

Para realizar o teste da classe Global com anotação `RestControllerAdvice` foi utilizado a anotação `@WebMvcTest`.
Pois `RestControllerAdvice` é usado para configurar o tratamento de exceções global para controladores Spring MVC.
Assim, o `@WebMvcTest` cria um contexto de teste do Spring MVC que inclui os componentes necessários para testar
controladores MVC.

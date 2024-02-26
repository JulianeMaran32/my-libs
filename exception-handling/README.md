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

## Estrutura

### errors

1. **validation**: Erros relacionados à validação de entrada de dados.
    - dataformat: Erros de formato de dados (email, CPF, senha).
    - range: Erros de valores fora da faixa permitida.
    - requiredfields: Erros de campos obrigatórios ausentes.
2. **business**: Erros relacionados à lógica de negócio da aplicação.
    - uniqueness: Erros de violação de unicidade (usuário já cadastrado).
    - passwordmismatch: Erros de senha inválida ou não confirmada.
    - permissions: Erros de permissões insuficientes.
3. **access**: Erros relacionados ao acesso a dados (banco de dados, arquivos).
    - database: Exceções relacionadas ao banco de dados.
    - serialization: Exceções relacionadas à serialização de objetos.
4. **integration**: Erros relacionados à comunicação com outros sistemas ou APIs.
    - externalapi: Exceções relacionadas à API externa.
    - network: Exceções relacionadas à rede.
5. **application**: Erros relacionados à lógica da aplicação (cálculos, inconsistências).
    - logic: Erros de lógica (cálculo, inconsistência de dados).
    - runtime: Exceções de tempo de execução (divisão por zero, `ArrayIndexOutOfBoundsException`).
6. **system**: Erros inesperados e não relacionados ao código da aplicação.
    - memory: Exceções de memória (`OutOfMemoryError`, `StackOverflowError`).
    - hardware: Exceções de hardware (erro de disco, leitura de arquivo).

### dto

Classes de transferência de dados (DTOs) para erros.

### handler

Manipulador de erros global (`GlobalErrorHandler`).

---

## Pacotes

- errors.validation: Erros de validação de dados.
- errors.business: Erros de negócio.
- errors.security: Erros de segurança.
- errors.payment: Erros de pagamento.
- errors.integration: Erros de integração.
- errors.system: Erros de sistema.

| ErrorStatus             | Classe                         | Pacote            |
|-------------------------|--------------------------------|-------------------|
| EMAIL_ALREADY_EXISTS    | EmailAlreadyExistsException    | errors.business   | OK
| INVALID_PASSWORD        | InvalidPasswordException       | errors.business   | OK
| PASSWORD_MISMATCH       | PasswordMismatchException      | errors.business   | OK
| PAYMENT_FAILED          | PaymentFailedException         | errors.business   | OK
| USER_ALREADY_EXISTS     | UserAlreadyExistsException     | errors.business   | OK
| USERNAME_ALREADY_EXISTS | UsernameAlreadyExistsException | errors.business   | OK
| FORBIDDEN_ACCESS        | ForbiddenAccessException       | errors.security   | OK
| UNAUTHORIZED_ACCESS     | UnauthorizedAccessException    | errors.security   | OK
| DATABASE_ERROR          | DatabaseErrorException         | errors.system     | OK
| INTERNAL_SERVER_ERROR   | InternalServerErrorException   | errors.system     | OK
| TIMEOUT_ERROR           | TimeoutErrorException          | errors.system     | OK
| UNKNOWN_ERROR           | UnknownErrorException          | errors.system     | OK
| CAPTCHA_INVALID         | CaptchaInvalidException        | errors.validation | OK
| INVALID_CNPJ            | InvalidCnpjException           | errors.validation | OK
| INVALID_CPF             | InvalidCpfException            | errors.validation | OK
| INVALID_EMAIL           | InvalidEmailException          | errors.validation | OK
| MISSING_REQUIRED_FIELDS | MissingRequiredFieldsException | errors.validation | OK
| PASSWORD_INVALID_FORMAT | PasswordInvalidFormatException | errors.validation | OK
| PASSWORD_TOO_SHORT      | PasswordTooShortException      | errors.validation | OK

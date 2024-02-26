package br.com.juhmaran.lib.exceptionhandling.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorStatus {

    INVALID_EMAIL(400, "Invalid Email", "E-mail inválido"),
    PASSWORD_TOO_SHORT(400, "Password Too Short", "Senha muito curta"),
    PASSWORD_INVALID_FORMAT(400, "Password Invalid Format", "Senha inválida"),
    CAPTCHA_INVALID(400, "Captcha Invalid", "Captcha inválido"),
    MISSING_REQUIRED_FIELDS(400, "Dados incompletos", "Preencha todos os campos obrigatórios."),
    INVALID_PASSWORD(400, "Senha inválida",
            "A senha deve conter no mínimo 8 caracteres, incluindo letras maiúsculas e minúsculas, números e símbolos."),
    PASSWORD_MISMATCH(400, "Senhas não coincidem", "Verifique se as senhas digitadas são iguais."),
    INVALID_CPF(400, "CPF inválido", "Digite um CPF válido."),
    INVALID_CNPJ(400, "CNPJ inválido", "Digite um CNPJ válido."),
    UNAUTHORIZED_ACCESS(401, "Acesso não autorizado",
            "Você não tem permissão para acessar este recurso."),
    FORBIDDEN_ACCESS(403, "Forbidden", "Você não tem permissão para acessar este recurso."),
    PAYMENT_FAILED(402, "Pagamento falhou",
            "O pagamento não foi realizado. Verifique seus dados e tente novamente."),
    EMAIL_ALREADY_EXISTS(409, "Email Already Exists", "E-mail já cadastrado"),
    USERNAME_ALREADY_EXISTS(409, "Username Already Exists", "Nome de usuário já cadastrado"),
    USER_ALREADY_EXISTS(409, "Usuário já cadastrado", "O e-mail ou nome de usuário já está em uso."),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error", "Erro interno do servidor"),
    DATABASE_ERROR(500, "Database Error", "Erro de banco de dados"),
    UNKNOWN_ERROR(500, "Unknown Error", "Erro desconhecido"),
    TIMEOUT_ERROR(504, "Gateway Timeout", "Tempo limite excedido");

    private final int code;
    private final String status;
    private final String messsage;

}

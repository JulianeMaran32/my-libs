package br.com.juhmaran.lib.exceptionhandling.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Enum que define os códigos de erro e mensagens para a API.
 * <p>
 * Os códigos de erro são mapeados para os códigos HTTP padrão.
 * <p>
 * Observação: Este enum é utilizado para fornecer mensagens de erro padronizadas e facilitar a comunicação com o
 * cliente. É importante revisar e adaptar as mensagens de erro para melhor se adequar ao contexto da sua aplicação.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Getter
@AllArgsConstructor
public enum ErrorStatus {

	// GENERIC
	GENERIC_BAD_REQUEST(400, "Bad Request", "Solicitação inválida."),
	GENERIC_NOT_FOUND(404, "Not Found", "Dados não encontrados."),

	// BUSINESS
	DOCUMENT_NUMBER_ALREADY_EXISTS(409, "Document Number Already Exists", "Número de documento já cadastrado."),
	EMAIL_ALREADY_EXISTS(409, "Email Already Exists", "E-mail já cadastrado."),
	ID_NOT_FOUND(404, "ID Not Found", "ID não encontrdo."),
	INVALID_PASSWORD(400, "Senha inválida.",
			"A senha deve conter no mínimo 8 caracteres, incluindo letras maiúsculas e minúsculas, números e símbolos."),
	PASSWORD_MISMATCH(400, "Senhas não coincidem", "Verifique se as senhas digitadas são iguais."),
	PAYMENT_FAILED(402, "Pagamento falhou",
			"O pagamento não foi realizado. Verifique seus dados e tente novamente."),
	USER_ALREADY_EXISTS(409, "Usuário já cadastrado", "O e-mail ou nome de usuário já está em uso."),
	USERNAME_ALREADY_EXISTS(409, "Username Already Exists", "Nome de usuário já cadastrado"),
	USER_NOT_FOUND(404, "User Not Found", "Usuário não encontrdo."),

	// SECURITY
	FORBIDDEN_ACCESS(403, "Forbidden", "Você não tem permissão para acessar este recurso."),
	UNAUTHORIZED_ACCESS(401, "Acesso não autorizado",
			"Você não tem permissão para acessar este recurso."),

	// SYSTEM
	DATABASE_ERROR(500, "Database Error", "Erro de banco de dados"),
	INTERNAL_SERVER_ERROR(500, "Internal Server Error", "Erro interno do servidor"),
	TIMEOUT_ERROR(504, "Gateway Timeout", "Tempo limite excedido"),
	UNKNOWN_ERROR(500, "Unknown Error", "Erro desconhecido"),

	// VALIDATION
	CAPTCHA_INVALID(400, "Captcha Invalid", "Captcha inválido"),
	INVALID_CPF(400, "CPF inválido", "Digite um CPF válido."),
	INVALID_CNPJ(400, "CNPJ inválido", "Digite um CNPJ válido."),
	INVALID_EMAIL(400, "Invalid Email", "E-mail inválido"),
	MISSING_REQUIRED_FIELDS(400, "Dados incompletos", "Preencha todos os campos obrigatórios."),
	PASSWORD_TOO_SHORT(400, "Password Too Short", "Senha muito curta"),
	PASSWORD_INVALID_FORMAT(400, "Password Invalid Format", "Senha inválida");

	private final int code;
	private final String status;
	private final String message;

}

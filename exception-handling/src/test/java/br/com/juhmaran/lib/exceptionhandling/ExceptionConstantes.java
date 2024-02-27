package br.com.juhmaran.lib.exceptionhandling;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;

public class ExceptionConstantes {

	public static final ErrorStatus INTERNAL_SERVER_ERROR = ErrorStatus.INTERNAL_SERVER_ERROR;
	public static final String EXPECTED_MESSAGE = "Ocorreu um erro personalizado";

	public static final Integer CODE_400 = 400;

	public static final String STATUS_400 = "Bad Request";
	public static final String MESSAGE_400 = "Solicitação inválida.";

	public static final Integer CODE_404 = 404;

	public static final String STATUS_404 = "Not Found";
	public static final String MESSAGE_404 = "Dados não encontrados.";

	public static final Integer CODE_500 = 500;

	public static final String STATUS_500 = "Internal Server Error";
	public static final String MESSAGE_500 = "Erro interno do servidor";


}

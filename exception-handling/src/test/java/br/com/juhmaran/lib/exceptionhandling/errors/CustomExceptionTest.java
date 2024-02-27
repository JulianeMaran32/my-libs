package br.com.juhmaran.lib.exceptionhandling.errors;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

import static br.com.juhmaran.lib.exceptionhandling.ExceptionConstantes.EXPECTED_MESSAGE;
import static br.com.juhmaran.lib.exceptionhandling.ExceptionConstantes.INTERNAL_SERVER_ERROR;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author juliane.maran
 * @since 2024-02-27
 */
@ExtendWith(MockitoExtension.class)
class CustomExceptionTest {

	private CustomException exception;

	@BeforeEach
	void setUp() {
		exception = new CustomException(ErrorStatus.INTERNAL_SERVER_ERROR);
	}

	@Test
	@DisplayName("A exceção CustomException deve propagar uma exceção genérica")
	void testShouldPropagateGenericException() {

		assertThrows(RuntimeException.class, () -> {
			throw new CustomException(ErrorStatus.INTERNAL_SERVER_ERROR);
		});

	}

	@Test
	@DisplayName("Deve lançar exceção com mensagem e código de status corretos")
	void testShouldThrowExceptionWithMessageAndStatus() {

		CustomException exception = assertThrows(CustomException.class, () -> {
			throw new CustomException(EXPECTED_MESSAGE, INTERNAL_SERVER_ERROR);
		});

		assertEquals(EXPECTED_MESSAGE, exception.getMessage());
		assertEquals(INTERNAL_SERVER_ERROR, exception.getErrorStatus());
	}

	@Test
	@DisplayName("Deve lançar exceção com mensagem, causa e código de status corretos")
	void should_throw_exception_with_message_cause_and_status() {

		Throwable cause = new IOException("Erro de IO");
		exception = new CustomException(EXPECTED_MESSAGE, cause, INTERNAL_SERVER_ERROR);

//		CustomException exception = assertThrows(CustomException.class, () -> {
//			throw new CustomException(EXPECTED_MESSAGE, cause, INTERNAL_SERVER_ERROR);
//		});

		assertTrue(exception.getCause().getMessage().contains("Erro de IO"));
		assertEquals(INTERNAL_SERVER_ERROR, exception.getErrorStatus());

//		assertEquals(EXPECTED_MESSAGE, exception.getMessage());
//		assertEquals(IOException.class, exception.getCause().getClass());
//		assertEquals(cause, exception.getCause());
//		assertEquals(INTERNAL_SERVER_ERROR, exception.getErrorStatus());
	}

	@Test
	@DisplayName("Deve lançar exceção com causa e código de status corretos")
	void testShouldThrowExceptionWithCauseAndStatus() {

		Throwable cause = new IOException("Erro de IO");

		exception = new CustomException(cause, INTERNAL_SERVER_ERROR);
//		CustomException exception = assertThrows(CustomException.class, () -> {
//			throw new CustomException(cause, INTERNAL_SERVER_ERROR);
//		});

		assertEquals(cause, exception.getCause());
		assertEquals(INTERNAL_SERVER_ERROR, exception.getErrorStatus());

	}

}
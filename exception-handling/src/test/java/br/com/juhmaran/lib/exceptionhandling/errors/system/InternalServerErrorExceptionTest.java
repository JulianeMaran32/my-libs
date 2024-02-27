package br.com.juhmaran.lib.exceptionhandling.errors.system;

import br.com.juhmaran.lib.exceptionhandling.dto.ErrorStatus;
import br.com.juhmaran.lib.exceptionhandling.errors.CustomException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("A subclasse InternalServerErrorException deve herdar comportamento do CustomException")
@ExtendWith(MockitoExtension.class)
class InternalServerErrorExceptionTest {

	@Test
	@DisplayName("Deve lançar exceção com código de status e mensagem corretos")
	void should_throw_exception_with_correct_status_and_message() {
		CustomException exception = assertThrows(CustomException.class, () -> {
			throw new InternalServerErrorException();
		});

		assertEquals(ErrorStatus.INTERNAL_SERVER_ERROR, exception.getErrorStatus());
	}

}
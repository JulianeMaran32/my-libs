package br.com.juhmaran.lib.exceptionhandling.annotations;

import br.com.juhmaran.lib.exceptionhandling.handler.GlobalErrorHandler;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Habilita o tratamento global de exceções para uma classe.
 * <p>
 * Ao adicionar esta anotação a uma classe, o framework irá interceptar todas as exceções não tratadas lançadas dentro
 * da classe e seus métodos.
 * <p>
 * A exceção interceptada será então delegada para um manipulador de exceções global configurado usando a anotação
 * `@GlobalErrorHandler`.
 * <p>
 * `@Retention(RetentionPolicy.RUNTIME)` indica que a anotação estará disponível em tempo de execução, possibilitando a
 * reflexão sobre classes anotadas.
 * <p>
 * `@Target(ElementType.TYPE)` indica que a anotação pode ser usada apenas em classes.
 * <p>
 * `@Import(value = {GlobalErrorHandler.class})` importa automaticamente a classe GlobalErrorHandler quando a anotação
 * `@EnableExceptionHandling` é usada. Isso garante que o framework registre o manipulador de erros global para a classe
 * anotada.
 *
 * @author juliane.maran
 * @since 2024-02-27
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(value = {GlobalErrorHandler.class})
public @interface EnableExceptionHandling {
}

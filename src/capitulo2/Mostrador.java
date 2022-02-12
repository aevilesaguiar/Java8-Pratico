package capitulo2;

import java.util.function.Consumer;

public class Mostrador implements Consumer<Usuario> {

	/*
	 * Criamos uma classe que implementa essa nova interface do Java 8. 
	 * Possuindo o único método accept responsável por pegar um objeto do
	 * tipo Usuario e consumi-lo. consumi-lo. ‘Consumir’ aqui é realizar alguma
	 * tarefa que faça sentido pra você. No nosso caso, é mostrar o nome do usuário
	 * na saída padrão. Depois disso, podemos instanciar essa classe e passar a
	 * referência para o esperado método forEach:
	 */

	@Override
	public void accept(Usuario u) {
		System.out.println(u.getNome());

	}

}

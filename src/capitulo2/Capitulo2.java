package capitulo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo2 {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("Aeviles Silva", 500);
		Usuario user2 = new Usuario("Flavio tavares", 1500);
		Usuario user3 = new Usuario("Inez Silva", 2500);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getNome());
		}

		List<Usuario> usuario2 = new ArrayList<Usuario>();
		usuario2.add(user1);
		usuario2.add(user2);
		usuario2.add(user3);

		for (Usuario usuario : usuario2) {
			System.out.println(usuario);
		}

		System.out.println("************************************");

		Mostrador mostrador = new Mostrador();
		usuarios.forEach(mostrador);

		System.out.println("************************************");

		System.out.println("Classe anônima");

		usuario2.forEach((Consumer<? super Usuario>) new Consumer<Usuario>() {
			public void accept(Usuario u) {
				System.out.println(u.getNome());
			}
		});
		System.out.println("************************************");

		System.out.println("Lambda - maneira simples de implementar uma interface que só tem 1 método");

		/*
		 * Então u -> System.out.println(u.getNome()) infere pro mesmo lambda que
		 * (Usuario u) -> {System.out.println(u.getNome());},
		 */
		
		usuario2.forEach(u -> System.out.println(u.getNome()));

	}

}

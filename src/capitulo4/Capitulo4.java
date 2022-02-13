package capitulo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import capitulo2.Usuario;

public class Capitulo4 {

	public static void main(String[] args) {

		Usuario user1 = new Usuario("Aeviles Silva", 500);
		Usuario user2 = new Usuario("Flavio tavares", 1500);
		Usuario user3 = new Usuario("Inez Silva", 2500);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		Consumer<Usuario> mostraMensagem=u->System.out.println("Antes de imprimir os nomes");
		
		Consumer<Usuario>imprimeNome=u->System.out.println(u.getNome());
		usuarios.forEach(mostraMensagem.andThen(imprimeNome));
		
		/*
		 * Predicate<Usuario> predicado = new Predicate<Usuario>() {
		 * 
		 * @Override public boolean test(Usuario t) {
		 * 
		 * return t.getPontos()>1500; }
		 * 
		 * };
		 */
		
		
		List <Usuario> usuarios1 = new ArrayList<>();
		
		usuarios1.add(user1);
		usuarios1.add(user2);
		usuarios1.add(user3);
		
		//Há um detalhe aqui: o removeIf invoca o remove de uma coleção, então ela
		//não pode serimutável, ou um UnsupportedOperationException será lançado.
		
		//usuarios1.removeIf(predicado);
		usuarios1.removeIf(u -> u.getPontos() > 1500);
		usuarios1.forEach(u->System.out.println(u));
		

	}

}

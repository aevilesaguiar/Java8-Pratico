package capitulo5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import capitulo2.Usuario;

public class Capitulo5 {

	public static void main(String[] args) {
		

		Usuario user1 = new Usuario("Inez Silva", 2500);
		Usuario user2 = new Usuario("Flavio tavares", 1500);
		Usuario user3 = new Usuario("Aeviles Silva", 500);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
		
		System.out.println("*******************************************");
		
		//pode ser feito de várias formas
		Comparator <Usuario> comparator = new Comparator<Usuario>() {
	
			@Override
			public int compare(Usuario u1, Usuario u2) {
				 
				return u1.getNome().compareTo(u2.getNome())  ;
			}
			
		};
		
		
		Collections.sort(usuarios,comparator);
		
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
		
		System.out.println("********************************************");
		Comparator<Usuario> comparator1=(u1,u2)-> u1.getNome().compareTo(u2.getNome());
		Collections.sort(usuarios, comparator1);
		System.out.println("********************************************");	
		Collections.sort(usuarios,(u1,u2)->u1.getNome().compareTo(u2.getNome()));
		System.out.println("********************************************");	
		usuarios.sort((u1,u2)->u1.getNome().compareTo(u2.getNome()));
		
		System.out.println(usuarios);
		
		
	}

}

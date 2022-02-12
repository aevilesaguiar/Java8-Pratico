package capitulo3;

import java.util.Iterator;

public class Capitulo3 {

	public static void main(String[] args) {

		Runnable r = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 50; i++) {
					System.out.println(i);
				}

			}
		};

		new Thread(r).start();

		// Interface Funcional (aquela que possui apenas um método)

		Runnable r1 = () -> {
			for (int i = 0; i <= 12; i++) {
				System.out.println(i);
			}
		};
		new Thread(r1).start();

		new Thread(() -> {
			for (int i = 0; i <= 8; i++) {
				System.out.println(i);
			}
		}).start();

		// O compilador já identifica a interface funcional pela sua estrutura
		Validador<String> validadorCEP = valor -> {return valor.matches("[0-9]{5}-[0-9]{3}");};

		System.out.println(validadorCEP.valida("04101-300"));
		System.out.println(validadorCEP.valida("04101-300"));
		
	}

}

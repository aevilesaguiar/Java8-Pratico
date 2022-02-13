package capitulo3;

public class Teste {

	public static void main(String[] args) {
		Runnable o = () -> {
			System.out.println("O que sou eu? Que lambda?");
		};
		
		System.out.println(o);
		System.out.println(o.getClass());

		// Assim como numa classe anônima local, você também pode acessar as variáveis
		// finais do método a qual você pertence:

		final int numero = 5;
		new Thread(() -> {
			System.out.println(numero);
		}).start();

		// Você pode até mesmo acessar a variável local que não é final:
		//Porém, ela deve ser efetivamente final. Isso é, apesar de não precisar declarar as
		//variáveis locais como final, você não pode alterá-lasse estiver utilizando-as dentro
		//do lambda. O seguinte código não compila:

		int numer02 = 5;
		new Thread(()->{
			System.out.println(numer02);
		}).start();

	}

}

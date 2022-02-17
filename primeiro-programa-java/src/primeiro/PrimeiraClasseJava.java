package primeiro;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		/*Estrutura de repetição for e CONTINUE*/

		for(int numero = 0; numero <= 10; numero++) {
			if(numero == 7 || numero == 6 || numero == 9) {
				System.out.println("Opa, encontrei o numero " + numero);
				continue;
			}
			
			System.out.println("Processando laço de repetição");
		}
			
		
	}
}

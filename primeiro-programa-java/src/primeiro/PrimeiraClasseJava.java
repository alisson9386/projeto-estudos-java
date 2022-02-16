package primeiro;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		/*Estrutura de repetição while/do while*/

		int numero = 0;
		int numero2 = 0;
		
		/*While verifica e depois executa*/
		while(numero <= 3) {
			System.out.println("O numero atual é: "+numero);
			numero ++;
		}
		
		/*-------------------------------------------*/
		
		/*Do while primeiro executa e depois verifica */
		do {
			System.out.println("O numero atual é: "+numero2);
			numero2 ++;
		}while(numero2 <= 60);
			
		
	}
}

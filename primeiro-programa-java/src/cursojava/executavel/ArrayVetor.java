package cursojava.executavel;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		/*Array pode ser de todos os tipos de dados e objetos também*/
		
		double[] notas = new double[5];
		
		notas[0] = 9.8;
		notas[1] = 9.7;
		notas[2] = 8.7;
		notas[3] = 7.7;
		
		for(int i = 0; i < 5; i++ ) {
			System.out.println("Nota " + (i + 1) + ": "+ notas[i]);
		}
	}

}

package cursojava.executavel;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		
		String[] valores = {"Alisson","98.5", "Curso Java", "alissondeives70@gmail.com"};
		
		float[] valorFloat = new float[4];
		
		for(int i = 0; i < valores.length; i++ ) {
			System.out.println("Valor na posição " + (i + 1) + ": "+ valores[i]);
		}
	}

}

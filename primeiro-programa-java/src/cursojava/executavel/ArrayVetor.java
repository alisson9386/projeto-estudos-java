package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		/*Array pode ser de todos os tipos de dados e objetos tamb�m*/
		
		String posicoes = JOptionPane.showInputDialog("Quantas posi��es o array deve ter?");
		
		
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		
		for(int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posi��o " + pos);
			notas[pos] = Double.valueOf(valor);
		}
		
		
		
		for(int i = 0; i < notas.length; i++ ) {
			System.out.println("Nota " + (i + 1) + ": "+ notas[i]);
		}
	}

}

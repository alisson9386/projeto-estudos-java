package primeiro;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		/*Entrada de dados*/
		
		String numeroPessoas = JOptionPane.showInputDialog("Informe o numero de pessoas: ");
		String numCarros = JOptionPane.showInputDialog("Informe a quantidade de carros: ");
		
		double carrosNumero = Double.parseDouble(numCarros);
		double pessoaNumero = Double.parseDouble(numeroPessoas);
		
		int divisao = (int) (carrosNumero / pessoaNumero);
		int resto = (int) (carrosNumero % pessoaNumero);
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, numeroPessoas +" pessoas\n"+ numCarros + " carros\n"+ divisao + " para cada um\n");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null,"Sobrou "+resto+" carro(s)");
		}
	}
}

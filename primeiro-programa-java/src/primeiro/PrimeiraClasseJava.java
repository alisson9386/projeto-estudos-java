package primeiro;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
		double n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota: "));

		double media = (n1 + n2 + n3 + n4) / 4;

		/*Condi��es l�gicas if e else
		if (media >= 70) {
			System.out.println("A m�dia � " + media + ", aluno reprovado!");
		} else if(media >= 40 && media <= 69){
			System.out.println("A m�dia � " + media + ", aluno em recupera��o!");
		}else {
			System.out.println("A m�dia � " + media + ", aluno aprovado!");
		}*/
		
		
		/*Operadores ten�rios s�o para micro valida��es*/
		
		 String saidaResultado = media >= 70 ? "Aluno aprovado" : (media >= 40 && media <= 69) ? "Aluno em recupera��o" : "Aluno Reprovado";
		 System.out.println(saidaResultado);
	}
}

package primeiro;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
		double n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota: "));

		double media = (n1 + n2 + n3 + n4) / 4;

		/*Condições lógicas if e else
		if (media >= 70) {
			System.out.println("A média é " + media + ", aluno reprovado!");
		} else if(media >= 40 && media <= 69){
			System.out.println("A média é " + media + ", aluno em recuperação!");
		}else {
			System.out.println("A média é " + media + ", aluno aprovado!");
		}*/
		
		
		/*Operadores tenários são para micro validações*/
		
		 String saidaResultado = media >= 70 ? "Aluno aprovado" : (media >= 40 && media <= 69) ? "Aluno em recuperação" : "Aluno Reprovado";
		 System.out.println(saidaResultado);
	}
}

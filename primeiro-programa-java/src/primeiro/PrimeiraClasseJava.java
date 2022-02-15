package primeiro;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
		double n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota: "));

		double media = (n1 + n2 + n3 + n4) / 4;

		/*Operações lógicas aninhadas: Operações dentro de operações*/
		
		if(media >= 50) {
			if(media >=70) {
				if(media > 90) {
					System.out.println("Aluno aprovado com média acima do comum");
				}else {
					System.out.println("Aluno aprovado direto");
				}
			}else {
				System.out.println("Aluno em recuperação");
			}
		}else {
			System.out.println("Aluno reprovado direto");
		}
		
		
	}
}

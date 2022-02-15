package primeiro;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));

		double media = (n1 + n2 + n3) / 3;

		if (media < 7) {
			System.out.println("A média é " + media + ", aluno reprovado!");
		} else {
			System.out.println("A média é " + media + ", aluno aprovado!");
		}

	}
}

package primeiro;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		/*Operações relacionais*/
		int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 1"));
		int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 2"));
		
		if (nota1 == nota2) {
			JOptionPane.showMessageDialog(null, "As notas são iguais", null, JOptionPane.INFORMATION_MESSAGE);
		}else if(nota1 != nota2){
			JOptionPane.showMessageDialog(null, "As notas são diferentes", null, JOptionPane.INFORMATION_MESSAGE);
		}else if(nota1 < nota2) {
			JOptionPane.showMessageDialog(null, "Nota 1 menor que nota 2", null, JOptionPane.INFORMATION_MESSAGE);
		}else if(nota1 > nota2) {
			JOptionPane.showMessageDialog(null, "Nota 1 maior que nota2", null, JOptionPane.INFORMATION_MESSAGE);
		}
		
		
	}
}

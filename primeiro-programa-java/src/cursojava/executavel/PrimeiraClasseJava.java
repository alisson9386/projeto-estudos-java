package cursojava.executavel;

import javax.swing.JOptionPane;

import curdojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		
		/*new Aluno() é uma instancia (criação de objeto)
		 * aluno1 é referencia para o objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
		String nota1 = JOptionPane.showInputDialog("1° nota");
		String nota2 = JOptionPane.showInputDialog("2° nota");
		String nota3 = JOptionPane.showInputDialog("3° nota");
		String nota4 = JOptionPane.showInputDialog("4° nota");
		String nomeEscola = JOptionPane.showInputDialog("Nome da escola");
		
		Aluno aluno1 = new Aluno(); 

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		aluno1.setNomeEscola(nomeEscola);

		
		System.out.println(aluno1.toString());
		System.out.println("Media: "+ aluno1.getMediaNota());
		System.out.println("Resultado: "+(aluno1.getSituacaoAluno()? "Aprovado" : "Reprovado"));
		
	}
}

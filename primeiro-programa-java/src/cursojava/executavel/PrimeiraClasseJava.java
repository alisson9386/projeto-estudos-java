package cursojava.executavel;

import javax.swing.JOptionPane;

import curdojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
		String registroGeral = JOptionPane.showInputDialog("Qual o RG do aluno?");
		String numeroCpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe do aluno?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
		String dataMatricula = JOptionPane.showInputDialog("Data de matricula do aluno");
		String nomeEscola = JOptionPane.showInputDialog("Nome da escola");
		String serie = JOptionPane.showInputDialog("Série do aluno");
		String disciplina1 = JOptionPane.showInputDialog("Qual a 1° disciplina");
		String nota1 = JOptionPane.showInputDialog("1° nota");
		String disciplina2 = JOptionPane.showInputDialog("Qual a 2° disciplina");
		String nota2 = JOptionPane.showInputDialog("2° nota");
		String disciplina3 = JOptionPane.showInputDialog("Qual a 3° disciplina");
		String nota3 = JOptionPane.showInputDialog("3° nota");
		String disciplina4 = JOptionPane.showInputDialog("Qual a 4° disciplina");
		String nota4 = JOptionPane.showInputDialog("4° nota");
		
		Aluno aluno1 = new Aluno(); 

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serie);
		
		

		
		System.out.println(aluno1.toString());
		System.out.println("Media: "+ aluno1.getMediaNota());
		System.out.println("Resultado: "+(aluno1.getSituacaoAluno()? "Aprovado" : "Reprovado"));
		
		
		
	}
}

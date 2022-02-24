package cursojava.executavel;

import javax.swing.JOptionPane;

import curdojava.classes.Aluno;
import curdojava.classes.Disciplina;

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
		
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(90);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matematica");
		disciplina2.setNota(90);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(90);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Historia");
		disciplina4.setNota(90);
		
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);
		aluno1.getDisciplinas().add(disciplina3);
		aluno1.getDisciplinas().add(disciplina4);

		
		System.out.println(aluno1.toString());
		System.out.println("Media: "+ aluno1.getMediaNota());
		System.out.println("Resultado: "+(aluno1.getSituacaoAluno()? "Aprovado" : "Reprovado"));
		
		
		
	}
}

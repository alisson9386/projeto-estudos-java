package cursojava.executavel;

import javax.swing.JOptionPane;

import curdojava.classes.Aluno;
import curdojava.classes.Disciplina;

public class PrimeiraClasseJava {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
		String registroGeral = JOptionPane.showInputDialog("Qual o RG do aluno?");
		String numeroCpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe do aluno?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
		String dataMatricula = JOptionPane.showInputDialog("Data de matricula do aluno");
		String nomeEscola = JOptionPane.showInputDialog("Nome da escola");
		String serie = JOptionPane.showInputDialog("Série do aluno");*/
		
		
		
		Aluno aluno1 = new Aluno(); 

		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serie);*/
		
		for(int pos = 1; pos <= 4 ; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+ pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+ pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if(escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover, 1, 2, 3 ou 4?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -1);
		}
		
		
		System.out.println(aluno1.toString());
		System.out.println("Media: "+ aluno1.getMediaNota());
		System.out.println("Resultado: "+aluno1.getSituacaoAluno2());
		
		
		
	}
}

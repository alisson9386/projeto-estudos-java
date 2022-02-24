package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import curdojava.classes.Aluno;
import curdojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		
		for(int qtd = 1; qtd <= 3; qtd++) {
		
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
		
		for(int pos = 1; pos <= 1 ; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+ pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+ pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		
		//int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		/*if(escolha == 0) {
			
			int continuarRemover = 0;
			int posicao = 1;
			
			while(continuarRemover == 0) {
				String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover, 1, 2, 3 ou 4?");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -posicao);
				posicao++;
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover? ");
			}
				
			
		}*/
		alunos.add(aluno1);
		}
		
		for (Aluno aluno : alunos) { /*Separado em listas*/
			if(aluno.getSituacaoAluno2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			}else if(aluno.getSituacaoAluno2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);
			}else {
				alunosReprovados.add(aluno);
			}
		}
		
		System.out.println("---------------------Lista dos alunos aprovados---------------------");
		
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Status do aluno: " + aluno.getSituacaoAluno2() + " com média de " + aluno.getMediaNota() + "\n");
			
		}
		
		System.out.println("---------------------Lista dos alunos em recuperação ---------------------");
		
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Status do aluno: " + aluno.getSituacaoAluno2() + " com média de " + aluno.getMediaNota() + "\n");
			
		}
		
		
		System.out.println("---------------------Lista dos alunos reprovados---------------------");
		
		for (Aluno aluno : alunosReprovados) {
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Status do aluno: " + aluno.getSituacaoAluno2() + " com média de " + aluno.getMediaNota() + "\n");
			
		}
		
	}
}

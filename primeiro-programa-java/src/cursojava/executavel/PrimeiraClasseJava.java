package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		
		try {		
			
			String login = JOptionPane.showInputDialog("Digite seu login");
			String senha = JOptionPane.showInputDialog("Digite sua senha");
			
 			if(new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) { /* Vou travar o contrato para autorizar somente quem realmente tem o contrato 100% legítimo*/
			//if(new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()) {
			List<Aluno> alunos = new ArrayList<Aluno>();
			
			/*HashMap é uma lista que tem dentro uma chave que identifica uma sequencia de valores*/
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			
			
			for(int qtd = 1; qtd <= 1; qtd++) {
			
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
			String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
			/*String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
			String registroGeral = JOptionPane.showInputDialog("Qual o RG do aluno?");
			String numeroCpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
			String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe do aluno?");
			String nomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
			String dataMatricula = JOptionPane.showInputDialog("Data de matricula do aluno");
			String nomeEscola = JOptionPane.showInputDialog("Nome da escola");
			String serie = JOptionPane.showInputDialog("Série do aluno");*/
			
			
			
			Aluno aluno1 = new Aluno(); 

			aluno1.setNome(nome);
			aluno1.setIdade(Integer.valueOf(idade));
			/*aluno1.setDataNascimento(dataNascimento);
			aluno1.setRegistroGeral(registroGeral);
			aluno1.setNumeroCpf(numeroCpf);
			aluno1.setNomeMae(nomeMae);
			aluno1.setNomePai(nomePai);
			aluno1.setDataMatricula(dataMatricula);
			aluno1.setNomeEscola(nomeEscola);
			aluno1.setSerieMatriculado(serie);*/
			
			for(int pos = 1; pos <= 1 ; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+ pos+" ?");
				@SuppressWarnings("unused")
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+ pos+" ?");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				//disciplina.setNota(Double.valueOf(notaDisciplina));
				
				aluno1.getDisciplinas().add(disciplina);
			}
			
			
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			
			if(escolha == 0) {
				
				int continuarRemover = 0;
				int posicao = 1;
				
				while(continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover, 1, 2, 3 ou 4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover? ");
				}
					
				
			}
			alunos.add(aluno1);
			}
			
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			
			for (Aluno aluno : alunos) { /*Separado em listas*/
				if(aluno.getSituacaoAluno2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				}else if(aluno.getSituacaoAluno2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				}else {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}
			
			System.out.println("---------------------Lista dos alunos aprovados---------------------");
			
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Status do aluno: " + aluno.getSituacaoAluno2() + " com média de " + aluno.getMediaNota() + "\n");
				
			}
			
			System.out.println("---------------------Lista dos alunos em recuperação ---------------------");
			
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Status do aluno: " + aluno.getSituacaoAluno2() + " com média de " + aluno.getMediaNota() + "\n");
				
			}
			
			
			System.out.println("---------------------Lista dos alunos reprovados---------------------");
			
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Status do aluno: " + aluno.getSituacaoAluno2() + " com média de " + aluno.getMediaNota() + "\n");
				
			}
			

			}else {
				JOptionPane.showMessageDialog(null, "Acesso Negado!");
			}
			
			/*Exceção de formatação de numero*/
		}catch (Exception e) {
			
			StringBuilder saida = new StringBuilder();
				
				/*Imprime o erro no log*/
				e.printStackTrace();
				
				/*Mensagem do erro ou causa*/
				System.out.println("Mensagem: " + e.getMessage());
				
				for(int i= 0; i < e.getStackTrace().length; i++){
					
					saida.append("\nClasse de erro: " + e.getStackTrace()[i].getClassName());
					saida.append("\nMetodo de erro: " + e.getStackTrace()[i].getMethodName());
					saida.append("\nLinha de erro: " + e.getStackTrace()[i].getLineNumber());
					saida.append("\nClasse do erro: " + e.getClass().getName()
							);
				}
				JOptionPane.showMessageDialog(null, "Erro de conversão de numero " + saida.toString());
				
		}
		
	}
}

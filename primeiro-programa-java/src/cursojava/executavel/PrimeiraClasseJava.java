package cursojava.executavel;

import curdojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		
		/*new Aluno() é uma instancia (criação de objeto)
		 * aluno1 é referencia para o objeto aluno*/
		
		Aluno aluno1 = new Aluno(); /*Joao*/
		aluno1.setNome("Joao da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("06/02/1997");
		aluno1.setRegistroGeral("17756119");
		aluno1.setNumeroCpf("13502004684");
		aluno1.setNomeMae("Lucimar");
		aluno1.setNomePai("Nivaldo");
		aluno1.setDataMatricula("06/07/2021");
		aluno1.setSerieMatriculado("6°");
		aluno1.setNomeEscola("Prodor");
		aluno1.setNota1(90);
		aluno1.setNota2(80);
		aluno1.setNota3(76);
		aluno1.setNota4(81);
		
		System.out.println("Aluno 1: "+ aluno1.getNome());
		System.out.println("Aluno 1: "+ aluno1.getIdade());
		System.out.println("Aluno 1: "+ aluno1.getDataNascimento());
		System.out.println("Aluno 1: "+ aluno1.getRegistroGeral());
		System.out.println("Aluno 1: "+ aluno1.getNumeroCpf());
		System.out.println("Aluno 1: "+ aluno1.getNomeMae());
		System.out.println("Aluno 1: "+ aluno1.getNomePai());
		System.out.println("Aluno 1: "+ aluno1.getDataMatricula());
		System.out.println("Aluno 1: "+ aluno1.getSerieMatriculado());
		System.out.println("Aluno 1: Média da nota: "+ aluno1.getMediaNota());
		System.out.println("Aluno 1: Resultado: "+ (aluno1.getSituacaoAluno()? "Aprovado" : "Reprovado"));
		System.out.println("Aluno 1: "+ aluno1.getNomeEscola() + "\n\n\n");
		
		
		
	}
}

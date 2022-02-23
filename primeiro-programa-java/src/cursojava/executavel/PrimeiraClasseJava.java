package cursojava.executavel;

import curdojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		
		/*new Aluno() é uma instancia (criação de objeto)
		 * aluno1 é referencia para o objeto aluno*/
		
		/*Aluno aluno1 = null; - NullPointerException*/
		Aluno aluno1 = new Aluno(); 

		aluno1.setNome("Alisson");
		aluno1.setIdade(25);
		aluno1.setDataNascimento("06/02/1997");
		
		System.out.println("Aluno 1: "+ aluno1.getNome());
		System.out.println("Aluno 1: "+ aluno1.getIdade());
		System.out.println("Aluno 1: "+ aluno1.getDataNascimento());
		System.out.println("Aluno 1: Média da nota: "+ aluno1.getMediaNota());
		System.out.println("Aluno 1: Resultado: "+ (aluno1.getSituacaoAluno()? "Aprovado" : "Reprovado"));
		System.out.println("Aluno 1: "+ aluno1.getNomeEscola() + "\n\n\n");
		
		
		
	}
}

package cursojava.executavel;

import curdojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		
		/*new Aluno() � uma instancia (cria��o de objeto)
		 * aluno1 � referencia para o objeto aluno*/
		
		Aluno aluno1 = new Aluno(); /*Joao*/
		
		Aluno aluno2 = new Aluno(); /*Pedro*/
		
		Aluno aluno3 = new Aluno(); /*Alisson*/
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jose", 50);
		
		
	}
}

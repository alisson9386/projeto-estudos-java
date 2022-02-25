package cursojava.executavel;

import curdojava.classes.Aluno;
import curdojava.classes.Diretor;
import curdojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alisson");
		
		
		
		Diretor diretor = new Diretor();
		diretor.setNome("Airton");
		
		
		Secretario secretario = new Secretario();
		secretario.setNome("Rubens");
		
		System.out.println("Aluno: " + aluno.getNome() );
		System.out.println("Diretor: " + diretor.getNome() );
		System.out.println("Secretario: " + secretario.getNome() );
	}

}

package cursojava.executavel;

import curdojava.classes.Aluno;
import curdojava.classes.Diretor;
import curdojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alisson");
		aluno.setIdade(25);
		
		
		Diretor diretor = new Diretor();
		diretor.setNome("Airton");
		diretor.setIdade(35);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Rubens");
		secretario.setIdade(18);
		
		System.out.println(aluno.pessoaMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Aluno: " + aluno.getNome() + " \nSituação: " + aluno.mensagemMaiorIdade() + "  \nSalario: " + aluno.salario());
		System.out.println("Diretor: " + diretor.getNome() );
		System.out.println("Secretario: " + secretario.getNome() );
		
		
		
		
	}

}

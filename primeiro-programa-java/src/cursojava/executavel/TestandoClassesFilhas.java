package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

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
		
		/*System.out.println(aluno.pessoaMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Aluno: " + aluno.getNome() + " \nSituação: " + aluno.mensagemMaiorIdade() + "  \nSalario: " + aluno.salario());
		System.out.println("Diretor: " + diretor.getNome() );
		System.out.println("Secretario: " + secretario.getNome() );*/
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Pessoa: " + pessoa.getNome());
		System.out.println("Salario: "+ pessoa.salario() + "\n");
	}

}

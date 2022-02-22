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
		
		System.out.println("Aluno 1: "+ aluno1.getNome());
		System.out.println("Aluno 1: "+ aluno1.getIdade());
		System.out.println("Aluno 1: "+ aluno1.getDataNascimento());
		System.out.println("Aluno 1: "+ aluno1.getRegistroGeral());
		System.out.println("Aluno 1: "+ aluno1.getNumeroCpf());
		System.out.println("Aluno 1: "+ aluno1.getNomeMae());
		System.out.println("Aluno 1: "+ aluno1.getNomePai());
		System.out.println("Aluno 1: "+ aluno1.getDataMatricula());
		System.out.println("Aluno 1: "+ aluno1.getSerieMatriculado());
		System.out.println("Aluno 1: "+ aluno1.getNomeEscola() + "\n\n\n");
		
		
		
		Aluno aluno2 = new Aluno(); /*Pedro*/
		aluno2.setNome("Alisson Vieira");
		aluno2.setIdade(25);
		aluno2.setDataNascimento("06/02/1997");
		aluno2.setRegistroGeral("17756119");
		aluno2.setNumeroCpf("13502004684");
		aluno2.setNomeMae("Lucimar");
		aluno2.setNomePai("Nivaldo");
		aluno2.setDataMatricula("06/07/2021");
		aluno2.setSerieMatriculado("6°");
		aluno2.setNomeEscola("Prodor");
		
		System.out.println("Aluno 2: "+ aluno2.getNome());
		System.out.println("Aluno 2: "+ aluno2.getIdade());
		System.out.println("Aluno 2: "+ aluno2.getDataNascimento());
		System.out.println("Aluno 2: "+ aluno2.getRegistroGeral());
		System.out.println("Aluno 2: "+ aluno2.getNumeroCpf());
		System.out.println("Aluno 2: "+ aluno2.getNomeMae());
		System.out.println("Aluno 2: "+ aluno2.getNomePai());
		System.out.println("Aluno 2: "+ aluno2.getDataMatricula());
		System.out.println("Aluno 2: "+ aluno2.getSerieMatriculado());
		System.out.println("Aluno 2: "+ aluno2.getNomeEscola());
		
		Aluno aluno3 = new Aluno(); /*Alisson*/
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jose", 50);
		
		
	}
}

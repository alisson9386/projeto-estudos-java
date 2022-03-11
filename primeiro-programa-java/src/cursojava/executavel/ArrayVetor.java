package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notas1 = { 8.8, 7.9, 4.5, 8.1 };
		double[] notas2 = { 9.8, 8.7, 7.4, 9.9 };

		Aluno aluno = new Aluno();

		aluno.setNome("Alisson");
		aluno.setNomeEscola("Jdev");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java");
		disciplina.setNota(notas1);

		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("SQL");
		disciplina2.setNota(notas2);

		aluno.getDisciplinas().add(disciplina2);

		//----------------------------------------------//
		
		Aluno[] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for(int i = 0; i < arrayAlunos.length; i++) {
			
			System.out.println("Nome do aluno: " + arrayAlunos[i].getNome());
			
			for(Disciplina d : arrayAlunos[i].getDisciplinas()) {
				
				System.out.println("\nNome da disciplina: " + d.getDisciplina());
				
				for(int posnota = 0; posnota < d.getNota().length; posnota++) {
					int posreal = posnota + 1;
					System.out.println("A nota "+ posreal + " é igual a: " + d.getNota()[posnota]);
					
				}
				
			}
			
		}

	}

}

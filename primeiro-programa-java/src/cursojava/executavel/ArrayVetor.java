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

		System.out.println("Nome do aluno: " + aluno.getNome() + " do cruso " + aluno.getNomeEscola());
		System.out.println("-------------------- Disciplinas do aluno --------------------");

		for (Disciplina disc : aluno.getDisciplinas()) {

			System.out.println("\nDisciplina: " + disc.getDisciplina());
			System.out.println("Notas da disciplina: ");

			for (int pos = 0; pos < disc.getNota().length; pos++) {

				int sit = pos + 1;
				System.out.println("Nota " + sit + ": " + disc.getNota()[pos]);
			}
		}

	}

}

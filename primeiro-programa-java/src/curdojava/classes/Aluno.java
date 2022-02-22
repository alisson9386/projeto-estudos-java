package curdojava.classes;

public class Aluno {

	/*Atributos do aluno*/
	public String nome;
	public int idade;
	public String dataNascimento;
	public String registroGeral;
	public String numeroCpf;
	public String nomeMae;
	public String nomePai;
	public String dataMatricula;
	public String nomeEscola;
	public String serieMatriculado;

	public Aluno() {
		
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
}

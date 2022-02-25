package curdojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

public class Aluno extends Pessoa { /*Classe filha*/

	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public Aluno() {

	}

	public Aluno(String nomePadrao) {
		super.nome = nomePadrao;
	}

	public Aluno(String nomePadrao, Integer idadePadrao) {
		super.nome = nomePadrao;
		super.idade = idadePadrao;
	}
	
	public double getMediaNota() {
		
		double somaNota = 0.0;
		
		for(Disciplina disciplina : disciplinas) {
			somaNota += disciplina.getNota();
		}
		
		return somaNota / disciplinas.size();
	}
	
	public boolean getSituacaoAluno() {
		double media = this.getMediaNota();
		if(media >= 70) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getSituacaoAluno2() {
		double media = this.getMediaNota();
		if(media >= 50) {
			if(media >= 70) {
				return StatusAluno.APROVADO;
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {
			return StatusAluno.REPROVADO;
		}
	}
	

	/* Métodos Getters e Setters do objeto */
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + "]";
	}
	
	@Override
	public boolean pessoaMaiorIdade() { /*Identifica método sobrescrito*/
		// TODO Auto-generated method stub
		return super.pessoaMaiorIdade();
	}
	
	
	
	public String mensagemMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Aluno maior de idade" : "Alunor menor de idade";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1500.90;
	}

}

package cursojava.excecao;

public class ExcecaoProcessarNota extends Exception{
	
	private static final long serialVersionUID = -6553891698726418049L;

	public ExcecaoProcessarNota(String erro) {

		super("Eita, um erro no processamento de arquivo de processar notas do aluno!" + erro);
	}

}

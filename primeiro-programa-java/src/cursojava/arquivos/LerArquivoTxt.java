package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoTxt {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream entradaArquivo 
		= new FileInputStream(new File("C:\\\\Users\\\\Alisson\\\\Documents\\\\GitHub\\\\primeiro-projeto-java\\\\primeiro-programa-java\\\\src\\\\cursojava\\\\arquivos\\\\arquivo.csv"));
		
		@SuppressWarnings("resource")
		Scanner lerAquivo = new Scanner(entradaArquivo, "UTF-8");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		
		while (lerAquivo.hasNext()) {
			
			String linha = lerAquivo.nextLine();
			
			if(linha != null && !linha.isEmpty()) {
				String[] dados = linha.split("\\;");
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoa.setIdade(Integer.parseInt(dados[2]));
				
				pessoas.add(pessoa);
			}
			
			
			
		}
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
		
	}

}

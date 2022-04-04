package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivoTxt {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream entradaArquivo 
		= new FileInputStream(new File("C:\\\\Users\\\\Alisson\\\\Documents\\\\GitHub\\\\primeiro-projeto-java\\\\primeiro-programa-java\\\\src\\\\cursojava\\\\arquivos\\\\arquivo.txt"));
		
		@SuppressWarnings("resource")
		Scanner lerAquivo = new Scanner(entradaArquivo, "UTF-8");
		
		
		while (lerAquivo.hasNext()) {
			
			String linha = lerAquivo.nextLine();
			
			if(linha != null && !linha.isEmpty()) {
				System.out.println(linha);
			}
			
			
		}
		
	}

}

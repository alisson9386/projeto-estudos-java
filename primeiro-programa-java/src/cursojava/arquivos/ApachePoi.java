package cursojava.arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Alisson\\Documents\\GitHub\\primeiro-projeto-java\\primeiro-programa-java\\src\\cursojava\\arquivos\\arquivo_excel.xls");
		
		if(!file.exists()) {
			
			file.createNewFile();			
		}
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setEmail("pessoa1@gmail.com");
		pessoa1.setIdade(50);
		pessoa1.setNome("Alisson Vieira");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("pessoa2@gmail.com");
		pessoa2.setIdade(25);
		pessoa2.setNome("Rafaela Vieira");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("pessoa3@gmail.com");
		pessoa3.setIdade(40);
		pessoa3.setNome("Nivaldo Vieira");
		
		Pessoa pessoa4 = new Pessoa();
		pessoa4.setEmail("pessoa4@gmail.com");
		pessoa4.setIdade(88);
		pessoa4.setNome("Maria Vieira");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		
		
		@SuppressWarnings("resource")
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); /*Usado para escrever na planilha*/
		HSSFSheet linhasPessoa = hssfWorkbook.createSheet("Planilha de pessoas JDev");
		
		int numeroLinha = 0;
		
		for (Pessoa p : pessoas) {
			
			Row linha = linhasPessoa.createRow(numeroLinha ++);/* Criando linha*/
			
			int celula = 0;
			
			Cell celNome = linha.createCell(celula ++);
			celNome.setCellValue(p.getNome());
			
			Cell celEmail = linha.createCell(celula ++);
			celEmail.setCellValue(p.getEmail());
			
			Cell celIdade = linha.createCell(celula ++);
			celIdade.setCellValue(p.getIdade());
			
		} /*Treminou a planilha*/
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
		
		
		System.out.println("Planilha criada");
		
	}

}

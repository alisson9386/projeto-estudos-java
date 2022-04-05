package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;



public class ApachePoiEditando {
	
	public static void main(String[] args) throws IOException {
		
		File  arquivo = new File("C:\\Users\\Alisson\\Documents\\GitHub\\primeiro-projeto-java\\primeiro-programa-java\\src\\cursojava\\arquivos\\arquivo_excel.xls");
		
		FileInputStream entrada = new FileInputStream(arquivo);
		
		@SuppressWarnings("resource")
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); /*Prepara entrada do arquivo excel*/
		
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0); /*Pega planilha*/
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		while(linhaIterator.hasNext()) {
			
			Row linha = linhaIterator.next();
			
			int numeroCelula = linha.getPhysicalNumberOfCells();
			
			Cell cell = linha.createCell(numeroCelula);
			
			cell.setCellValue("5.487,20");
			
		}
		
		entrada.close();
		
		FileOutputStream saida = new FileOutputStream(arquivo);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
		
		
		System.out.println("Planilha atualizada");
		
	}

}

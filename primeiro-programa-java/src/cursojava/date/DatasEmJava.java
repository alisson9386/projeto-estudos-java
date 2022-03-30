package cursojava.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2022");
		
		Date dataAtualHoje = simpleDateFormat.parse("10/04/2022");
		
		if(dataVencimentoBoleto.after(dataAtualHoje)) {
			System.out.println("Boleto não vencido");
		}else if(dataVencimentoBoleto.equals(dataAtualHoje)){
			System.out.println("Boleto vence hoje");
		}else {
			System.out.println("Boleto vencido");
		}
			
		}
		
	}


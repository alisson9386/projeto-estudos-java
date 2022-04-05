package cursojava.date;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException, InterruptedException {
		
		LocalDate dataBase = LocalDate.parse("2022-03-07");
		
		/*System.out.println("Mais 5 dias: " + (dataBase.plusDays(5)));
		
		System.out.println("Mais 5 semanas " + (dataBase = dataBase.plusWeeks(5)));
		
		System.out.println("Mais 5 meses " + (dataBase = dataBase.plusMonths(5)));
		
		System.out.println("Mais 5 anos " + (dataBase = dataBase.plusYears(5)));
		
		System.out.println("Menos 1 ano " + (dataBase = dataBase.minusYears(1)));
		
		System.out.println("Menos 1 mes " + (dataBase = dataBase.minusMonths(1)));
		
		System.out.println("Menos 1 semana " + (dataBase = dataBase.minusWeeks(1)));
		
		System.out.println("Menos 1 dia " + (dataBase = dataBase.minusDays(1)));*/
		
		for(int mes = 1; mes <= 12; mes++) {
			dataBase = dataBase.plusMonths(1);
			System.out.println("Vencimento do boleto: " + dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do mês: " + mes);
			
		}
		
		
		}
		
	}


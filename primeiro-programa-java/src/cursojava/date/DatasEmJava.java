package cursojava.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException {
				
			long dias = ChronoUnit.DAYS.between(LocalDate.parse("2022-02-01"), LocalDate.now());
			
			System.out.println("Possui "+dias+" dias entre a faixa de data");
			
			
			long decadas = ChronoUnit.DECADES.between(LocalDate.parse("1998-02-01"), LocalDate.now());
			
			System.out.println("Possui "+decadas+" decadas entre a faixa de data");
		
		}
		
	}


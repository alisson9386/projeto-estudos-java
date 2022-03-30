package cursojava.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException {
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data atual: "+dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana: " + dataAtual.getDayOfWeek());
		
		System.out.println("Dia do mês: " + dataAtual.getDayOfMonth());
		
		System.out.println("Dia do ano: " + dataAtual.getDayOfYear());
		
		System.out.println("Mês: "+ dataAtual.getMonth());
		
		System.out.println("Ano: " + dataAtual.getYear());
		
		
		
		}
		
	}


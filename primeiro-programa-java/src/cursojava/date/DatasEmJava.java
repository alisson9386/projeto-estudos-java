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
		
		/*Nova API de data do Java 8 em diante*/
		
		LocalDate dataAtual = LocalDate.now();
		
		LocalTime horaAtual = LocalTime.now();
		
		LocalDateTime dataEHoraAtual = LocalDateTime.now();
		
		System.out.println("Data atual: "+dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Hora atual: "+horaAtual.format(DateTimeFormatter.ofPattern("HH:mm.ss")));
		System.out.println("Hora e data atual: "+ dataEHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		
		
		}
		
	}


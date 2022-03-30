package cursojava.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException, InterruptedException {
		
		LocalDate dataAntiga = LocalDate.parse("2010-03-07");
		
		LocalDate dataNova = LocalDate.parse("2021-04-03");
		
		System.out.println("Data antiga é maior que data nova? "+dataAntiga.isAfter(dataNova));
		
		System.out.println("Data antiga é anterior a data nova? "+dataAntiga.isBefore(dataNova));
		
		System.out.println("Datas são iguais? " + dataAntiga.isEqual(dataNova));
		
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias tem a faiza de periodo? "+periodo.getDays());
		
		System.out.println("Quantos meses tem a faiza de periodo? "+periodo.getMonths());
		
		System.out.println("Quantos anos tem a faiza de periodo? "+periodo.getYears());
		
		System.out.println("Somente em meses: "+periodo.toTotalMonths());
		
		System.out.println("Periodo anos: " + periodo.getYears() + " anos, "+periodo.getMonths() + " meses e "+periodo.getDays() + " dias");
		
		}
		
	}


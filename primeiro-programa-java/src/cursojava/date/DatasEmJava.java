package cursojava.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException, InterruptedException {
		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Duração em nano segundos: " + duracao.toNanos());
		
		System.out.println("Duração em Minutos: " + duracao.toMinutes());
		
		System.out.println("Duração em Horas: " + duracao.toHours());
		
		System.out.println("Duração em milisegundos: " + duracao.toMillis());
		
		
		}
		
	}


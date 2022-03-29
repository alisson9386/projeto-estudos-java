package cursojava.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos: " + date.getTime());
		System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());
		
		System.out.println("\nDia do mês: " + date.getDate());
		System.out.println("Calendar dia do mês: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("\nDia da semana: " + date.getDay());
		System.out.println("Calendar dia da semana: " + (calendar.get(Calendar.DAY_OF_WEEK) - 1));
		
		System.out.println("\nHora atual: " + date.getHours());
		System.out.println("Calendar hora atual: " + calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("\nMinuto atual: " + date.getMinutes());
		System.out.println("Calendar minuto atual: " + calendar.get(Calendar.MINUTE));
		
		System.out.println("\nSegundos atual: " + date.getSeconds());
		System.out.println("Calendar segundos atual: " + calendar.get(Calendar.SECOND));
		
		System.out.println("\nAno atual: " + (date.getYear() + 1900));
		System.out.println("Calendar ano atual: " + calendar.get(Calendar.YEAR));
		
		
		//-----------------------------------------//
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data atual: "+ simpleDateFormat.format(date));
		
		System.out.println("Data atual calendar: "+ simpleDateFormat.format(calendar.getTime()));
		
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println("Data atual para banco: "+ simpleDateFormat.format(date));
		
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(simpleDateFormat.parse("1997-02-06"));
		
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(simpleDateFormat.parse("06/02/1997"));
		
	}

}

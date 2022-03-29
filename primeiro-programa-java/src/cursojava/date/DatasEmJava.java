package cursojava.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos: " + date.getTime());
		System.out.println("Dia do mês: " + date.getDate());
		System.out.println("Dia da semana: " + date.getDay());
		System.out.println("Hora atual: " + date.getHours());
		System.out.println("Minuto atual: " + date.getMinutes());
		System.out.println("Segundos atual: " + date.getSeconds());
		System.out.println("Mês atual: " + date.getMonth());
		System.out.println("Ano atual: " + (date.getYear() + 1900));
		System.out.println("Timezone atual: " + date.getTimezoneOffset());
		
		
		//-----------------------------------------//
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data atual: "+ simpleDateFormat.format(date));
		
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println("Data atual para banco: "+ simpleDateFormat.format(date));
		
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(simpleDateFormat.parse("1997-02-06"));
		
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(simpleDateFormat.parse("06/02/1997"));
		
	}

}

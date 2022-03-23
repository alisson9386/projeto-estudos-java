package cursojava.date;

import java.util.Date;

public class DatasEmJava {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos: " + date.getTime());
		System.out.println("Dia do m�s: " + date.getDate());
		System.out.println("Dia da semana: " + date.getDay());
		System.out.println("Hora atual: " + date.getHours());
		System.out.println("Minuto atual: " + date.getMinutes());
		System.out.println("Segundos atual: " + date.getSeconds());
		System.out.println("M�s atual: " + date.getMonth());
		System.out.println("Ano atual: " + (date.getYear() + 1900));
		System.out.println("Timezone atual: " + date.getTimezoneOffset());
		
	}

}

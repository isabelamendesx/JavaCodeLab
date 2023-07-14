package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class Main {

	public static void main(String[] args) {
		
		LocalDate data04 = LocalDate.parse("2022-07-20"); // ISO8601 -> Data
		Instant data06 = Instant.parse("2022-07-20T01:30:26Z"); // ISO8601 -> Data-Hora global GMT

		//==== CONVERTENDO DATA-HORA GLOBAL PARA LOCAL
		
		for(String s : ZoneId.getAvailableZoneIds()) { // ZONAS DE HORÁRIO DISPONÍVEIS
			System.out.println(s);
		}
		
		LocalDate resultado1 = LocalDate.ofInstant(data06, ZoneId.systemDefault()); // CONVERTENDO LONDRES PRO SISTEMA LOCAL
		System.out.println("resultado 1 = " + resultado1);
		LocalDate resultado2 = LocalDate.ofInstant(data06, ZoneId.of("Portugal")); 
		System.out.println("resultado 1 = " + resultado2); // CONVERTENDO LONDRES PARA PORTUGAL
		
		//==== OBTENDO DADOS DE UMA HORA LOCAL
		
		System.out.println("data 04 dia = " + data04.getDayOfMonth());
		System.out.println("data 04 mês = " + data04.getMonthValue());
		System.out.println("data 04 dia = " + data04.getYear());
		
	}

}

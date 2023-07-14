package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		// === CRIANDO FORMATAÇÕES ESPECÍFICAS
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 
		DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); 
		DateTimeFormatter formato4 = DateTimeFormatter.ISO_INSTANT;
		
		LocalDate data04 = LocalDate.parse("2022-07-20"); // ISO8601 -> Data
		LocalDateTime data05 = LocalDateTime.parse("2022-07-20T01:30:26"); // ISO8601 -> Data-Hora
		Instant data06 = Instant.parse("2022-07-20T01:30:26Z"); // ISO8601 -> Data-Hora global GMT
	
		System.out.println("data 04 = " + data04.format(formato1));
		System.out.println("data 04 = " + formato1.format(data04));
		System.out.println("data 04 = " + data04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		//===== IMPRIMINDO FORMATADO UMA HORA LOCAL
		System.out.println("data 05 = " + data05.format(formato1));
		System.out.println("data 05 = " + data05.format(formato2));
		
		//===== IMPRIMINDO FORMATADO UMA HORA GLOBAL
		System.out.println("data 06 = " + formato3.format(data06));
		System.out.println("data 06 = " + formato4.format(data06));
	}

}

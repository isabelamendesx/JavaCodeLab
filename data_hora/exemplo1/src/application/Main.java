package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Criando uma formatação específica
		
		// ===== DATA-HORA AGORA
		LocalDate data01 = LocalDate.now(); // Agora -> Data
		LocalDateTime data02 = LocalDateTime.now(); // Agora -> Data-Hora local
		Instant data03 = Instant.now(); // Agora -> Data-Hora global
		
	    // ====== ISO8601 -> DATA-HORA
		LocalDate data04 = LocalDate.parse("2022-07-20"); // ISO8601 -> Data
		LocalDateTime data05 = LocalDateTime.parse("2022-07-20T01:30:26"); // ISO8601 -> Data-Hora
		Instant data06 = Instant.parse("2022-07-20T01:30:26Z"); // ISO8601 -> Data-Hora global GMT
		Instant data07 = Instant.parse("2022-07-20T01:30:26-03:00"); // ISO8601 -> Data-Hora global GMT SP
		
		// ====== FORMATO PERSONALISADO
		LocalDate data08 = LocalDate.parse("20/07/2022", formato1); // Data-Hora formato específico
		
		// ==== DIA, MÊS, ANO -> DATA-HORA LOCAL
		LocalDate data09 = LocalDate.of(2022,  7, 20);
		LocalDateTime data10 = LocalDateTime.of(2022, 7, 20, 1, 30);
				
		System.out.println("data 01 = " + data01);
		System.out.println("data 02 = " + data02);
		System.out.println("data 03 = " + data03);
		System.out.println("data 04 = " + data04);
		System.out.println("data 05 = " + data05);
		System.out.println("data 06 = " + data06);
		System.out.println("data 07 = " + data07);
		System.out.println("data 08 = " + data08);
		System.out.println("data 09 = " + data09);
		System.out.println("data 10 = " + data10);


	}

}

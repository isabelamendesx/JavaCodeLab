package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
	
	public static void main(String[] args) {
	
	LocalDate data04 = LocalDate.parse("2022-07-20"); // ISO8601 -> Data
	LocalDateTime data05 = LocalDateTime.parse("2022-07-20T01:30:26"); // ISO8601 -> Data-Hora
	Instant data06 = Instant.parse("2022-07-20T01:30:26Z"); // ISO8601 -> Data-Hora global GMT
	
	//===== OBTENDO INFORMAÇÕES A PARTIR DE DATAS

	LocalDate pastWeekLocalDate = data04.minusDays(7);
	LocalDate nextWeekLocalDate = data04.plusDays(7);
	
	LocalDateTime pastWeekLocalDateTime = data05.minusMinutes(30);
	LocalDateTime nextWeekLocalDateTime = data05.plusHours(10);
	
	Instant pastWeekInstant = data06.minus(7, ChronoUnit.DAYS);
	Instant nextWeekInstant = data06.minus(7, ChronoUnit.DAYS);
	
	//===== DESCOBRINDO DURAÇÃO
	
	Duration tempo1 = Duration.between(pastWeekLocalDateTime, data05);
	Duration tempo2 = Duration.between(pastWeekLocalDate.atTime(0,0), data04); 
	Duration tempo3 = Duration.between(pastWeekLocalDate.atStartOfDay(), data04);// NÃO POSSO USAR LOCALDATE DIRETO
	System.out.println("tempo1 dias = " + tempo1.toDays());
	System.out.println("tempo2 dias = " + tempo2.toDays());
	System.out.println("tempo3 dias = " + tempo3.toDays());
	
	
	
	
	
	
	}
}

package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Exercício Data e hora
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Data local com formatação
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now(); // data local atual
		LocalDateTime d02 = LocalDateTime.now(); // data local com hora atual
		
		Instant d03 = Instant.now(); // Data Hora global atual z (Londres data hora +3h ou 0h do ponto de Gw)
		
		
		// Gerar um texto iso8601
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); // Impressão no formato iso 8601
		LocalDateTime d09 = LocalDateTime.parse("22/07/2022 01:30", fmt2);
		LocalDateTime d009 = LocalDateTime.parse("22/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022,  7, 20, 1, 30);
		
		
		
		
		
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());  // como se tivesse o toString() implicito mas não precisa colocar
		
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d009 = " + d009);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		
		sc.close();
	}

}

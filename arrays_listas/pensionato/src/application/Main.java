package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quarto;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos quartos serão Alugados?\n");
		int n = sc.nextInt();
		Quarto[] vect = new Quarto[10];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("ALUGUEL #%d:\n", (i + 1));
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.printf("Quarto: ");
			int quarto = sc.nextInt();
			System.out.println();
			vect[quarto] = new Quarto(nome, email, quarto);
		}
		
		
		System.out.println("Quartos ocupados: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.printf("%d: %s, %s\n", vect[i].getQuarto(), vect[i].getNome(), vect[i].getEmail());
			}
		}
		

	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Main {
		
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Quantas pessoas você vai digitar?");
			int n = sc.nextInt();
			Pessoa[] vect = new Pessoa[n];
			int aux = 0;
			int maior_idade = 0;
			
			for(int i = 0; i < vect.length; i++) {
				System.out.printf("Dados da %dº pessoa:\n", (i + 1));
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Idade: ");
				int idade = sc.nextInt();
				vect[i] = new Pessoa(nome, idade);
				if (vect[i].getIdade() > maior_idade) {
					maior_idade = vect[i].getIdade();
					aux = i;
				}
				
			}
				System.out.printf("PESSOA MAIS VELHA: %s", vect[aux].getNome());

	}

}

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		double altura = 0.0;
		Pessoa[] vect = new Pessoa[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Dados da %dº pessoa:\n", (i + 1));
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			
			altura = sc.nextDouble();
			vect[i] = new Pessoa(nome, altura, idade);
		}
		
		System.out.println();
		System.out.print("Altura média: ");
		
		double soma = 0.0;
		for(int i = 0; i < vect.length; i++) {
			soma += vect[i].getAltura();
		}
		
		double média = soma / vect.length;
		System.out.printf("%.2f\n", média);
		
		System.out.print("Pessoas com menos de 16 anos: ");
		
		int somaIdades = 0;
		for(int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				somaIdades++;
			}
		}
		
		double porcentagem = (100 / vect.length) * somaIdades;
		System.out.printf("%.1f%%\n", porcentagem);
		
		for(int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}
		
		sc.close();

	}

}

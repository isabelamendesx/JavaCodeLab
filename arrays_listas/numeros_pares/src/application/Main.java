package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int aux = 0;
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite o " + (i+1) + " número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NÚMEROS PARES:");
		
		
		for(int i =0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d  ", vect[i]);
				aux++;
			}
		}
		
		System.out.println();
		System.out.printf("QUANTIDADE DE PARES = %d", aux);
		
		sc.close();
		
		
		
	}

}

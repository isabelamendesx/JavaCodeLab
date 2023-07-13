package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double aux = 0;
		int posicao = 0;
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite o " + (i+1) + " número: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("MAIOR VALOR = ");
		
		
		for(int i =0; i < vect.length; i++) {
			if (vect[i] > aux) {
				aux = vect[i];
				posicao = i;
			}
		}
		
		System.out.printf("%.2f", aux);
		System.out.println();
		System.out.printf("POSIÇÃO MAIOR VALOR= %d", posicao);
		
		sc.close();

	}

}

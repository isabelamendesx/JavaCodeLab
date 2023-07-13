package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite o " + (i+1) + " número: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		for(int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
		}
		
		System.out.println();
		System.out.print("SOMA = ");
		double soma = 0.0;
		for(int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}
		System.out.println(soma);
		
		double media = soma / vect.length;
		
		System.out.printf("MEDIA = %.2f", media);
		

	}

}

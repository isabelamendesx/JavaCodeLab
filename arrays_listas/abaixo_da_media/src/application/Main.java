package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite o " + (i+1) + " número: ");
			vect[i] = sc.nextDouble();
			soma += vect[i]; 
		}
		
		System.out.println();
		double média = soma / vect.length;
		System.out.printf("MÉDIA DO VETOR = %.3f\n", média);

		System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < média) {
				System.out.printf("%.1f\n", vect[i]);
			}
		}
		
		
		
		
		
		
		
		
		
	}
}

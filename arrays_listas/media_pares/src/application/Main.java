package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		int aux = 0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite o " + (i+1) + " número: ");
			vect[i] = sc.nextDouble();
			if(vect[i] % 2 == 0) {
				soma += vect[i];
				aux++;
			}
 
		}
		
		System.out.println();
		double média = soma / aux;
		if(média > 0) {
			System.out.printf("MÉDIA DOS PARES = %.1f", média);
		} else {
			System.out.println("NENHUM NÚMERO PAR");
		}

		sc.close();

	}

}

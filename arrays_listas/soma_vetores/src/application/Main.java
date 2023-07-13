package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	double aux = 0;
	int posicao = 0;
	
	System.out.print("Quantos valores cada vetor vai ter? ");
	int n = sc.nextInt();
	int[] vectA = new int[n];
	int[] vectB = new int[n];
	int[] vectC = new int[n];
	
	System.out.println("Digite os valores do vetor A:");
	
	for(int i = 0; i < vectA.length; i++) {
		vectA[i] = sc.nextInt();
	}
	
	System.out.println();
	System.out.println("Digite os valores do vetor B: ");
	
	for(int i = 0; i < vectB.length; i++) {
		vectB[i] = sc.nextInt();
	}
	
	
	System.out.println();
	System.out.println("VETOR RESULTANTE: ");
	for(int i = 0; i < vectC.length; i++) {
		vectC[i] = vectA[i] + vectB[i];
		System.out.printf("%d \n", vectC[i]);
	}
	
	
	
	
}
}
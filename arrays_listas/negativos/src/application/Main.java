package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int n;

		
		System.out.print("Enter vector size: ");
		n = sc.nextInt();
		int[] vect = new int[n];
		
		
		for(int i = 0; i < vect.length; i++ ) {
			System.out.print("Digite o " + (i+1) + "º numero:");
			vect[i] = sc.nextInt();	
		}
		
		System.out.println("NEGATIVE NUMBERS:");
		for(int i = 0; i < vect.length; i++ ) {
			if(vect[i] < 0) {
			System.out.println(vect[i]);
		}
	}

		sc.close();
}}

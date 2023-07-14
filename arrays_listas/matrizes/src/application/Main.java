package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas linhas sua matriz terá? ");
		int n = sc.nextInt();
		//sc.nextLine();
		System.out.printf("Quantas colunas sua matriz terá? ");
		sc.nextLine();
		int m = sc.nextInt();
	
		
		int[][] matriz = new int[n][m];
		
		System.out.println("Digite os números:");
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.printf("Digite o número que deseja buscar: ");
		int x = sc.nextInt();
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] == x) {
					System.out.print("Position " + i + "," + j + ":");
					if(j > 0) {
						System.out.printf("\nLeft: %d\n", matriz[i][j - 1]);
					}
					if(j < 3) {
						System.out.printf("Right: %d\n", matriz[i][j + 1]);
					}
					if(i < 3) {
						System.out.printf("Down: %d\n", matriz[i + 1][j]);
					}
					if(i > 0)
						System.out.printf("Up: %d\n", matriz[i - 1][j]);
					}
					//System.out.printf("\nLeft: %d\nRight: %d\nDown: %d\n", matriz[i][j - 1], matriz[i][j + 1], matriz[i + 1][j]);
				}
			}
	
		sc.close();
		
	}

}

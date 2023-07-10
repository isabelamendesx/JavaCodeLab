package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		int quantity;
		
		Locale.setDefault(Locale.US); // Settando local para USA para usar "." e não ","
		Scanner sc = new Scanner(System.in); // Leitura
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine(); // Leitura até a quebra de linha
 		System.out.print("Price: ");
 		product.price = sc.nextDouble(); // Leitura tipo double
 		System.out.print("Quantity in stock: ");
 		product.quantity = sc.nextInt(); // Leitura do tipo int
 		
 		System.out.println();
 		System.out.println("Product data: " + product);
 		
 		// ADICIONANDO PRODUTO NO ESTOQUE
 		System.out.println();
 		System.out.println("Enter the number of products to be added in stock: ");
 		quantity = sc.nextInt();
 		product.addProducts(quantity);
 		
 		// REMOVENDO PRODUTOS DO ESTOQUE
 		System.out.println();
 		System.out.println("Enter the number of products to be removed from stock: ");
 		quantity = sc.nextInt();
 		product.removeProducts(quantity);
 		
 		System.out.println();
 		System.out.println("Product data: " + product);
		
		
		
		
		
		sc.close();
		
		
		

	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double currentDollar = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double dollarsToBought = sc.nextDouble();
		
		double amount = CurrencyConverter.amountCalculator(currentDollar, dollarsToBought);
		
		System.out.printf("Amount to be paid in reais = %.2f\n", amount);
		
		
		sc.close();

	}

}

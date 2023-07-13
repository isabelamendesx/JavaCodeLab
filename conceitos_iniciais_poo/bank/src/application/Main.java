package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double accountBalance = 0.00;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();		
		System.out.print("Is there a initial deposit value (y/n)");
		char aux = sc.next().charAt(0);
		BankAccount account = new BankAccount(accountNumber, name);
		
		if (aux == 'y') {
			System.out.print("Enter initial deposit value: ");
			accountBalance = sc.nextDouble();
			account.setAccountBalance(accountBalance);
			System.out.println();
			System.out.println("Account data: ");
			System.out.println(account);
		}
		else {
			System.out.println();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
			System.out.println("Account data: ");
			System.out.println(account);
		}
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		accountBalance += sc.nextDouble();
		account.setAccountBalance(accountBalance);
		System.out.println("Updated account data: ");
		System.out.println(account);
	
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		accountBalance -= sc.nextDouble() + 5.00;
		account.setAccountBalance(accountBalance);
		System.out.println("Updated account data: ");
		System.out.println(account);

	sc.close();
}


}
	

import model.entities.Account;
import model.exceptions.MyException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


            System.out.println("Enter account data");
            System.out.print("Number: ");
            Integer accountNumber = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String accountHolder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double accountBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double accountWithDraw = sc.nextDouble();

            Account account = new Account(accountNumber, accountHolder, accountBalance, accountWithDraw);

            System.out.println();

            System.out.print("Enter the amount for withdraw: ");
            Double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());
        }
        catch (MyException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        sc.close();

    }
}
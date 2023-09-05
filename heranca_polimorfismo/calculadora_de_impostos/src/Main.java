import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> contribuintes = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int aux = sc.nextInt();

        for(int i = 1;i <= aux; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or Company (i/c)? ");
            char aux2 = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Anual income: ");
            Double rendaAnual = sc.nextDouble();
            if(aux2 == 'i'){
                System.out.print("Health expenditures: ");
                Double gastosSaude = sc.nextDouble();
                Contribuinte contribuinte = new PessoaFisica(nome, rendaAnual, gastosSaude);
                contribuintes.add(contribuinte);
            } else {
                System.out.print("Number of employees: ");
                Integer numFuncionarios = sc.nextInt();
                Contribuinte contribuinte = new PessoaJuridica(nome, rendaAnual, numFuncionarios);
                contribuintes.add(contribuinte);
            }
        }

        System.out.println();
        Double impostosTotais = 0.0;
        System.out.println("TAXES PAID:");
        for(Contribuinte c : contribuintes){
            System.out.printf("%s $  %.2f\n", c.getNome(), c.calculaImposto());
            impostosTotais += c.calculaImposto();
        }

        System.out.println();
        System.out.print("TOTAL TAXES: $" + impostosTotais);

        sc.close();











    }
}
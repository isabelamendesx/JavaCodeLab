import entities.Contract;
import entities.Installment;
import service.ContractService;
import service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        Integer numeroContrato = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate dataContrato = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Valor do contrato: ");
        Double valorTotal = sc.nextDouble();
        Contract contract = new Contract(numeroContrato, dataContrato, valorTotal);
        System.out.print("Entre com o numero de parcelas: ");
        Integer parcelas = sc.nextInt();
        ContractService service = new ContractService(new PaypalService());
        service.processContract(contract, parcelas);
        System.out.println("Parcelas: ");
        for(Installment installment : contract.getInstallments()){
            System.out.println(installment.getDueDate().format(fmt) + " - " + installment.getAmount());
        }


        sc.close();



    }
}
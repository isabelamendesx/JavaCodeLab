package service;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;

public class ContractService {

    public OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, Integer months){
        Double parcelaBasica = contract.getTotalValue() / months;

        for(int i = 1; i <= months; i++){

            LocalDate dataVencimento = contract.getDate().plusMonths(i);

            Double jurosSimples = paymentService.interest(parcelaBasica, i);
            Double taxaPagamento = paymentService.paymentFee(parcelaBasica + jurosSimples);
            Double parcelaTotal = parcelaBasica + jurosSimples + taxaPagamento;

            contract.getInstallments().add(new Installment(dataVencimento, parcelaTotal));
        }
    }
}

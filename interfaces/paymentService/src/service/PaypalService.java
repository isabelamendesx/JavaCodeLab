package service;

public class PaypalService implements OnlinePaymentService {

    // taxa de pagamento
    public Double paymentFee(Double amount){
        return amount * 0.02;
    }

    // juros mensal simples
    public Double interest(Double amount, Integer months){
        return (amount * 0.01) * months;

    }
}

package demo.payment;

public class CreditPaymentStrategy implements PaymentStrategy{
    @Override
    public boolean pay(Double amount) {
        System.out.println(" Paying Credit card payment"+ amount);
        return true;
    }
}

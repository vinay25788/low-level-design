package demo.payment;

public class PaypalStrategy implements PaymentStrategy {


    @Override
    public boolean pay(Double amount) {
        System.out.println("Processing paypal payment "+amount);
        return true;
    }
}

package demo.payment;

public class PaymentStrategyFactory {

    public static PaymentStrategy getPaymentStrategy(PaymentType type)
    {
       return switch (type)
        {
            case CREDIT_CARD -> new CreditPaymentStrategy();
            case PAYPAL ->  new PaypalStrategy();

        };

    }
}

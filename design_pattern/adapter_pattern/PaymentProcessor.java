public interface PaymentProcessor {

    public void processPayment(double amount, String accountId);

    public boolean isPaymentSuccessful(String accountId);
}


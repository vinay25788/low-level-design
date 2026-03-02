public class AdapterLegacyPaymentProcessor  implements PaymentProcessor{

    LegacyPaymentProcessor legacyPaymentProcessor;

    AdapterLegacyPaymentProcessor(LegacyPaymentProcessor legacyPaymentProcessor)
    {
        this.legacyPaymentProcessor = legacyPaymentProcessor;
    }





    @Override
    public void processPayment(double amount, String accountId) {
        legacyPaymentProcessor.makePayment(amount, accountId);  // adapting method
    }

    @Override
    public boolean isPaymentSuccessful(String accountId) {
        return legacyPaymentProcessor.verifyPayment(accountId);  // adapting method
    }
}

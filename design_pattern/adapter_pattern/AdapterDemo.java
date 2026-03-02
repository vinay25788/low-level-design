public class AdapterDemo {

    public static void main(String[] args) {
        LegacyPaymentProcessor legacyPaymentProcessor = new LegacyPaymentProcessor();
        AdapterLegacyPaymentProcessor processor = new AdapterLegacyPaymentProcessor(legacyPaymentProcessor);
        processor.processPayment(12.00, "AccountId12345");
        processor.isPaymentSuccessful("AccountId12345");
    }
}

public class LegacyPaymentProcessor  {


    public void makePayment(double amt, String accId) {
        System.out.println("Legacy payment processing: " + accId + " amount: " + amt);
    }

    public boolean verifyPayment(String accId) {
        System.out.println("Legacy verifying payment for: " + accId);
        return true;
    }
}

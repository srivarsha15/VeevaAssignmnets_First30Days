package PaymentProcessingSystem;

abstract public class BasePayment implements PaymentMethod{

    protected final String merchantId;

    public BasePayment(String merchantId) {
        this.merchantId = merchantId;
    }

    @Override
    public void processPayment(int amount) {
        System.out.println("Processing Payment for merchant " + merchantId + " with amount " + amount);

    }
    public void processPayment(float amount) {
        System.out.println("Processing Payment for merchant " + merchantId + " with amount " + amount);

    }

    @Override
    public void connect() {
        System.out.println("Connecting to Payment Merchant " + merchantId);

    }
}

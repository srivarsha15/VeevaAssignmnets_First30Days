package PaymentProcessingSystem;

public class Main {
    public static void main(String[] args) {
        Creditcard creditCard = new Creditcard("101");
        creditCard.connect();
        creditCard.processPayment(100.0F);
        Paypal paypal = new Paypal("102");
        paypal.connect();
        paypal.processPayment(100);
        UPI upi = new UPI("103");
        upi.connect();
        upi.processPayment(200.0F);
    }
}

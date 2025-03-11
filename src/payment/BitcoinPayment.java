package payment;

public class BitcoinPayment implements PaymentStrategy {

    String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public String getPaymentDetails() {
        return "Wallet Address: " + walletAddress + "\n" + "Payment Method: Bitcoin Payment";
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid: ₿" + amount);
        System.out.println(getPaymentDetails());

    }
}

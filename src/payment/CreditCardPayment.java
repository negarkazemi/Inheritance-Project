package payment;

public class CreditCardPayment implements PaymentStrategy {

    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public String getPaymentDetails() {
        return "cardNumber: " + cardNumber + "\n" + "cardHolderName: " + cardHolderName + "\n" + "Payment Method: CreditCard Payment";
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid: $" + amount);
        System.out.println(getPaymentDetails());

    }
}

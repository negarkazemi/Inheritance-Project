package payment;

public class PayPalPayment implements PaymentStrategy {

    String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public String getPaymentDetails() {
        return "Email: " + email + "\n" + "Payment Method: PayPal Payment";
    }

    @Override
    public void pay(double amount) {

        System.out.println("Paid: $" + amount);
        System.out.println(getPaymentDetails());

    }
}
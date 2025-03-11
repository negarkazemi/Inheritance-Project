import payment.*;

public class Main {
    public static void main(String[] args) {

        RegularCustomer customer1 = new RegularCustomer("Negar");
        RegularCustomer customer2 = new RegularCustomer("Mohammad");
        PremiumCustomer customer3 = new PremiumCustomer("Nill");

        CreditCardPayment creditCardPayment = new CreditCardPayment("1234 5678 9101 1121", "Negar");
        PayPalPayment payPalPayment = new PayPalPayment("Mmdtr@gmail.com");
        BitcoinPayment bitcoinPayment = new BitcoinPayment("1Lbcfr7sAHTD9CgdQo3HTMTkV8LK4ZnX71");

        System.out.println("\n\n");
        System.out.println("Customer Information----------------------------------------------\n");
        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();
        customer3.displayCustomerInfo();

        System.out.println("\n\n");
        System.out.println("Receipts-----------------------------------------------------------\n");
        customer1.makePayment(creditCardPayment, 122.44);
        customer1.makePayment(creditCardPayment, 23.99);
        customer2.makePayment(payPalPayment, 345);
        customer2.makePayment(payPalPayment, 10.65);
        customer3.makePayment(bitcoinPayment, 10);
        customer3.makePayment(bitcoinPayment, 7);

        System.out.println("\n\n");
        System.out.println("Customer Payment History Report---------------------------------------\n");

        customer1.showPaymentHistory();
        customer2.showPaymentHistory();
        customer3.showPaymentHistory();

    }
}
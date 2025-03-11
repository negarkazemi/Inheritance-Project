package payment;

import java.util.ArrayList;

public abstract class Customer {
    String name;
    ArrayList<String> paymentHistory;

    public Customer(String name) {
        this.name = name;
        paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();


    public void makePayment(PaymentStrategy paymentStrategy, double amount) {
        paymentStrategy.pay(amount);
        paymentHistory.add(paymentStrategy.getPaymentDetails() + "\nPaid: " + amount);
    }

    public void showPaymentHistory() {
        System.out.println(this.name + "--------------------");
        for (String history : paymentHistory)
            System.out.println(history);
        System.out.println();
    }

}

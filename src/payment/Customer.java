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

    public void makePayment(IPaymentStrategy paymentStrategy, double amount) {
        System.out.print(name + "------>");
        paymentStrategy.pay(amount);
        paymentHistory.add(paymentStrategy.getPaymentDetails() + "Amount : " + amount);
    }

    public void showPaymentHistory() {
        for (String payment : paymentHistory)
            System.out.println(payment);
    }
}
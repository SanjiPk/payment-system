package payment;

public class PayPalPayment implements IPaymentStrategy{

    String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println(getPaymentDetails() + "Amount : " + String.valueOf(amount));
    }

    @Override
    public String getPaymentDetails() {
        return String.format("PayPal payment with eamil : %s%n", email);
    }

}
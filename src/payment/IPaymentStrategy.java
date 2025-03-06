package payment;

public interface IPaymentStrategy {
    void pay(double amount);
    String getPaymentDetails();
}
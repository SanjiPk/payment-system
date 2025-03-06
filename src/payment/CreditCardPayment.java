package payment;

public class CreditCardPayment implements IPaymentStrategy{

    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println(getPaymentDetails() + String.valueOf(amount));
    }

    @Override
    public String getPaymentDetails() {
        return String.format("creditcard payment with cardNumber : %s%n" + 
                            "card HolderName : %n", cardNumber, cardHolderName);
    }
}

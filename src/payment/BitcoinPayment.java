package payment;

public class BitcoinPayment implements IPaymentStrategy{

    String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println(getPaymentDetails() + "Amount : " + String.valueOf(amount));
    }

    @Override
    public String getPaymentDetails() {
        return String.format("bitcoin payment with wallet address : %s%n", walletAddress);
    }
}
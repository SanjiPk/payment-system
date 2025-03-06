import java.util.ArrayList;
import java.util.Arrays;

import payment.*;

public class Main {

    public static void main(String[] args) {
        Customer david = new RegularCustomer("David");
        Customer sara = new RegularCustomer("Sara");
        Customer mickel = new PremiumCustomer("Mickel");

        ArrayList<Customer> customerList = new ArrayList<>(Arrays.asList(david, sara, mickel));

        IPaymentStrategy creditCard = new CreditCardPayment("5068 4598 4689 9987",
                                                            "pashmak");
        IPaymentStrategy bitCoin = new BitcoinPayment("6445adf4w566");
        IPaymentStrategy PayPal = new PayPalPayment("matin@gmail.com");
        
        david.makePayment(creditCard, 230000);
        david.makePayment(bitCoin, 68000000);
        david.makePayment(PayPal, 45000);

        sara.makePayment(creditCard, 50000);
        sara.makePayment(PayPal, 60000);

        mickel.makePayment(PayPal, 690000);
        mickel.makePayment(bitCoin, 1000000000);

        for (Customer c : customerList) {
            c.displayCustomerInfo();
            c.showPaymentHistory();
        }
    }
}
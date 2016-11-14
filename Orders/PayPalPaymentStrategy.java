package Orders;

/**
 * Created by Olia on 07.11.2016.
 */
public class PayPalPaymentStrategy implements IPayment {

    @Override
    public void pay(double price) {
        System.out.println("PayPal payment");
    }

}

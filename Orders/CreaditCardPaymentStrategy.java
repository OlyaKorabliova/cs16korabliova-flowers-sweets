package Orders;

/**
 * Created by Olia on 07.11.2016.
 */
public class CreaditCardPaymentStrategy implements IPayment {

    @Override
    public void pay(double price) {
        System.out.println("Paid with credit card");
    }

}

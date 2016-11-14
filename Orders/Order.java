package Orders;

import java.util.ArrayList;

/**
 * Created by Olia on 07.11.2016.
 */
public class Order {
    private ArrayList<Bouquet> items;
    private IPayment payment;
    private IDelivery delivery;

    public void setDeliveryStrategy(IDelivery delivery) {
        this.delivery = delivery;
    }

    public void setPaymentStrategy(IPayment payment) {
        this.payment = payment;
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Bouquet i : items) {
            total += i.price();
        }
        return total;
    }

    public void processOrder() {
        if (payment != null) {
            payment.pay(calculateTotalPrice());
        }
        delivery.delivery(items);
    }

    public void addItem(Bouquet b) {
        items.add(b);
    }

    public void removeItem(Bouquet b) {
        items.remove(b);
    }

}

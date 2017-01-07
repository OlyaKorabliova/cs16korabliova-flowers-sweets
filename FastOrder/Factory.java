package FastOrder;

import Order.Order;
/**
 * Created by Olia on 21.11.2016.
 */
public class Factory {
    Order order;

    public Factory(Order order) {
        this.order = order;
    }

    public Order getOrder(Class type) {
        Order orders = new Order();
        if (type == (new BirthdayBouquet()).getClass()) {
            BirthdayBouquet birthBouq = new BirthdayBouquet();
            orders.addItem(birthBouq);
        }
        else if (type == (new WeedingBouquet()).getClass()) {
            WeedingBouquet weedBouq = new WeedingBouquet();
            orders.addItem(weedBouq);
        }
        else if (type == (new FuneralBouquet()).getClass()) {
            FuneralBouquet funerBouq = new FuneralBouquet();
            orders.addItem(funerBouq);
        }
        else if (type == (new TulipsBouquet()).getClass()) {
            TulipsBouquet tulips = new TulipsBouquet();
            orders.addItem(tulips);
        }
        return orders;
    }
}

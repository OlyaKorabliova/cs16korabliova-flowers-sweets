package Orders;

/**
 * Created by Olia on 07.11.2016.
 */
public class BasketDecorator extends ItemDecorator{

    private Item item;

    public BasketDecorator(Item item) {
        super(item);
    }

    public void getDescription() {
        System.out.println("Basket Decorator");
    }

    @Override
    double price() {
        return 50 + item.price();
    }
}

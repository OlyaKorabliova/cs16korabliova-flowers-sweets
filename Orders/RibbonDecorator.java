package Orders;

/**
 * Created by Olia on 07.11.2016.
 */
public class RibbonDecorator extends ItemDecorator {

    private Item item;

    public RibbonDecorator(Item item) {
        super(item);
    }

    public void getDescription() {
        System.out.println("Ribbon Decorator");
    }

    @Override
    double price() {
        return 25 + item.price();
    }
}

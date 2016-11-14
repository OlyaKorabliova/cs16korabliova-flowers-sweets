package Orders;

/**
 * Created by Olia on 07.11.2016.
 */
public class PaperDecorator extends ItemDecorator {

    private Item item;

    public PaperDecorator(Item item) {
        super(item);
    }

    public void getDescription() {
        System.out.println("Paper Decorator");
    }

    @Override
    double price() {
        return 10 + item.price();
    }
}

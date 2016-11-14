package Orders;

/**
 * Created by Olia on 07.11.2016.
 */
abstract public class ItemDecorator extends Item {

    private Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    public abstract void getDescription();
}

package Orders;

import java.util.ArrayList;

/**
 * Created by Olia on 07.11.2016.
 */
public class PostDeliveryStrategy implements IDelivery {

    @Override
    public void delivery(ArrayList items) {
        System.out.println("Post Delivery");
    }
}

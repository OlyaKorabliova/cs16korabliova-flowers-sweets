package Orders;

import java.util.ArrayList;

/**
 * Created by Olia on 07.11.2016.
 */
public class DHLDeliveryStrategy implements IDelivery {

    @Override
    public void delivery(ArrayList items) {
        System.out.println("DHL Delivery");
    }
}

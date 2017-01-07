package FastOrder;

import com.korabliova.study.home_tasks.*;
import Order.Bouquet;

/**
 * Created by Olia on 21.11.2016.
 */
public class FuneralBouquet extends Bouquet {

    public FuneralBouquet() {
        FlowerSpec spec1 = new FlowerSpec(FlowerType.TULIP, 5, FlowerColor.RED, 12, 6.8);
        FlowerSpec spec2 = new FlowerSpec(FlowerType.CHAMOMILE, 5, FlowerColor.YELLOW, 10, 7.9);

        OneFlower flw1 = new OneFlower(spec1);
        OneFlower flw2 = new OneFlower(spec2);
        Bouquet bouquet = new Bouquet();
        bouquet.addFlowers(flw1, flw2);
    }

}

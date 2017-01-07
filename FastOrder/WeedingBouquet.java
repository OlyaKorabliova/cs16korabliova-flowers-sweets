package FastOrder;

import com.korabliova.study.home_tasks.*;
import Order.Bouquet;

/**
 * Created by Olia on 21.11.2016.
 */
public class WeedingBouquet extends Bouquet {

    public WeedingBouquet() {
        FlowerSpec spec1 = new FlowerSpec(FlowerType.TULIP, 5, FlowerColor.RED, 12, 6.8);
        FlowerSpec spec2 = new FlowerSpec(FlowerType.ROSE, 4, FlowerColor.BLUE, 8, 18);
        FlowerSpec spec3 = new FlowerSpec(FlowerType.TULIP, 3, FlowerColor.WHITE, 0, 7);

        OneFlower flw1 = new OneFlower(spec1);
        OneFlower flw2 = new OneFlower(spec2);
        OneFlower flw3 = new OneFlower(spec3);
        Bouquet bouquet = new Bouquet();
        bouquet.addFlowers(flw1, flw2, flw3);
    }

}

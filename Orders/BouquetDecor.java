package Orders;

import com.korabliova.study.home_tasks.Flower;
import com.korabliova.study.home_tasks.FlowerSpec;

/**
 * Created by Olia on 14.11.2016.
 */
public class BouquetDecor extends Bouquet {

    Bouquet bouquet = new Bouquet();
    private double discount = 0.35;

    public BouquetDecor(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    public void addFlowers(Flower flwr) {
        bouquet.addFlowers(flwr);
    }

    public double price() {
        return this.bouquet.price() * discount;
    }

    public String searchFlower(FlowerSpec flwr) {
        return bouquet.searchFlower(flwr);
    }

    public String toString() {
        return bouquet.toString();
    }
}

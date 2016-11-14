package Orders;

import com.korabliova.study.home_tasks.Flower;
import com.korabliova.study.home_tasks.FlowerSpec;

import java.util.Arrays;

/**
 * Created by Olia on 03.10.2016.
 */

public class Bouquet{

    // class of our bouquet

    private Flower[] flwrs = new Flower[0];        //an array of flowers
    private double sum = 0;

    public void addFlowers(Flower... flower){
        //adds a new flower to our bouquet
        Flower[] newFlwrs;
        newFlwrs = Arrays.copyOf(flwrs, flwrs.length + flower.length);
        int j = flwrs.length;
        for (int i = 0; i < flower.length; i++) {
            newFlwrs[j] = flower[i];
            j++;
        }
        flwrs = newFlwrs;
    }

    public double price() {
        //counts price of our bouquet
        for (int i = 0; i < flwrs.length; i++) {
            sum += flwrs[i].getPrice();
        }
        return sum;
    }

    public String searchFlower(FlowerSpec spec) {
        // search for specified flowers in our bouquet
        int count = 0;
        for (int i = 0; i < flwrs.length; i++) {
            if (flwrs[i].getSpec().matches(spec)) {
                count++;
            }
        }

        Flower[] result = new Flower[count];
        int j = 0;
        for (int i = 0; i < flwrs.length; i++) {
            if (flwrs[i].getSpec().matches(spec)) {
                result[j] = flwrs[i];
                j++;
            }
        }
        return Arrays.toString(result);
    }

    public String toString(){
        return Arrays.toString(flwrs);
    }

}

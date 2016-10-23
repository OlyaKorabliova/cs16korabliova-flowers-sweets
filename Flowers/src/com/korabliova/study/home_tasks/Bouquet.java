package com.korabliova.study.home_tasks;

import java.util.Arrays;

/**
 * Created by Olia on 03.10.2016.
 */

public class Bouquet {
    
    // class of our bouquet
    
    private Flower[] flwrs = new Flower[0];        //an array of flowers
    private double sum = 0;

    public void addFlower(Flower... flower){
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

    public double countPrice(){
        //counts price of our bouquet
        for (int i = 0; i < flwrs.length; i++){
            sum += flwrs[i].getPrice();
        }
        return sum;
    }

    public FlowerType findFlowerByStemSize(double range1, double range2){
        //finds a flower by its freshness
        for (int i = 0; i < flwrs.length; i++){
            if (range1 <= flwrs[i].getStemSize() && flwrs[i].getStemSize() <= range2){
                return flwrs[i].getType();
            }
        }
        return FlowerType.NO_TYPE;
    }

    public String search(FlowerSpec spec) {
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

    public String sortFlowers(){
        //sorts flowers in bouquet by freshness
        Arrays.sort(flwrs, (a, b) -> Integer.compare(a.getFreshness(), b.getFreshness()));
        return Arrays.toString(flwrs);
    }

    public String toString(){
        return Arrays.toString(flwrs);
    }
}

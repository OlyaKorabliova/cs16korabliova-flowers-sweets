package com.korabliova.study.home_tasks;

import java.util.Arrays;

/**
 * Created by Olia on 03.10.2016.
 */

public class Bouquet{
    
    // class of our bouquet
    
    private Flower[] flwrs = new Flower[0];        //an array of flowers
    private int lastIndex = 0;
    private double sum = 0;

    public void addFlower(Flower flower){
        //adds a new flower to our bouquet
        Flower[] newFlwrs;
        newFlwrs = Arrays.copyOf(flwrs, flwrs.length + 1);
        flwrs = newFlwrs;
        flwrs[lastIndex] = flower;
        lastIndex++;
        
    }

    public double countPrice(){
        //counts price of our bouquet
        for (int i = 0; i < flwrs.length; i++){
            sum += flwrs[i].price;
        }
        return sum;
    }

    public String findFlowerByStemSize(double range1, double range2){
        //finds a flower by its freshness
        for (int i = 0; i < flwrs.length; i++){
            if (range1 <= flwrs[i].getStemSize() && flwrs[i].getStemSize() <= range2){
                return flwrs[i].name;
            }
        }
        return "Bouquet has no flowers with such stem size :(";
    }

    public String sortFlowers(){
        //sorts flowers in bouquet by freshness
        Arrays.sort(flwrs, (a, b) -> Integer.compare(a.freshness, b.freshness));
        return Arrays.toString(flwrs);
    }

    public String toString(){
        return Arrays.toString(flwrs);
    }
}

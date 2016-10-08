package com.korabliova.study.home_tasks;

/**
 * Created by Olia on 03.10.2016.
 */

public class Tulips extends Flower {

    // class of tulips for our bouquet

    public Tulips(double stemSize, double price, int freshness, String color){
        this.name = color + " tulip";
        this.color = color;
        this.stemSize = stemSize;
        this.price = price;
        this.freshness = freshness;
    }

}

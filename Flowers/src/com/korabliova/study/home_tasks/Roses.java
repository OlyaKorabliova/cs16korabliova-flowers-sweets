package com.korabliova.study.home_tasks;

/**
 * Created by Olia on 04.10.2016.
 */
public class Roses extends Flower {

    // class of roses for our bouquet

    public Roses(double stemSize, double price, int freshness, String color){
        this.name = color + " rose";
        this.color = color;
        this.stemSize = stemSize;
        this.price = price;
        this.freshness = freshness;
    }
}

package com.korabliova.study.home_tasks;

/**
 * Created by Olia on 04.10.2016.
 */
public class Chamomiles extends Flower {

    // class of chamomiles for our bouquet

    public Chamomiles(double stemSize, double price, int freshness, String color){
        this.name = color + " chamomile";
        this.color = color;
        this.stemSize = stemSize;
        this.price = price;
        this.freshness = freshness;
    }
}

package com.korabliova.study.home_tasks;

/**
 * Created by Olia on 03.10.2016.
 */
public class Flower {
    protected String name = "";
    protected double stemSize = 10;
    protected double price = 20;
    protected String color = "";
    protected int freshness = 5;

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStemSize(double stemSize) {
        this.stemSize = stemSize;
    }

    public double getStemSize() {
        return stemSize;
    }

    public String toString(){
        return this.name;
    }
}

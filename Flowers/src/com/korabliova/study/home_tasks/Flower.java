package com.korabliova.study.home_tasks;

/**
 * Created by Olia on 03.10.2016.
 */
public class Flower {
    protected FlowerSpec spec;

    public FlowerSpec getSpec() {
        return spec;
    }

    public Flower(FlowerSpec spec) {
        this.spec = spec;
    }


    public void setType(FlowerType type) {
        spec.setType(type);
    }

    public void setStemSize(double stemSize) {
        spec.setStemSize(stemSize);
    }

    public void setPrice(double price) {
        spec.setPrice(price);
    }

    public void setColor(FlowerColor color) {
        spec.setColor(color);
    }

    public void setFreshness(int freshness) {
        spec.setFreshness(freshness);
    }

    public FlowerType getType() {
        return spec.getType();
    }

    public int getFreshness() {
        return spec.getFreshness();
    }

    public FlowerColor getColor() {
        return spec.getColor();
    }

    public double getPrice() {
        return spec.getPrice();
    }

    public double getStemSize() {
        return spec.getStemSize();
    }

    public String toString() {
        return spec.getColor().toString() + " " + spec.getType().toString();
    }

    //abstract public boolean hasSpikes();
}

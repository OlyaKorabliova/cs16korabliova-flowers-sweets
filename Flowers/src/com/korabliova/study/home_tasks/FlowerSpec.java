package com.korabliova.study.home_tasks;

/**
 * Created by Olia on 17.10.2016.
 */
public class FlowerSpec {

    protected FlowerType type;
    protected double stemSize;
    protected double price;
    protected FlowerColor color;
    protected int freshness = 5;

    public FlowerSpec(FlowerType type, int freshness, FlowerColor color, double price, double stemSize) {
        this.type = type;
        this.freshness = freshness;
        this.color = color;
        this.price = price;
        this.stemSize = stemSize;
    }

    public boolean matches(FlowerSpec otherSpec) {
        // check if an object matches our specifications
        boolean k = true;
        if (otherSpec.getType() == FlowerType.NO_TYPE) {
            k = true;
        }
        else if (type != otherSpec.getType()) {
            return false;
        }
        if (otherSpec.getFreshness() == 0) {
            k = true;
        }
        else if (freshness != otherSpec.getFreshness()) {
            return false;
        }
        if (otherSpec.getColor() == FlowerColor.NO_COLOR) {
            k = true;
        }
        else if (color != otherSpec.getColor()) {
            return false;
        }
        if (otherSpec.getPrice() == 0) {
            k = true;
        }
        else if (price != otherSpec.getPrice()) {
            return false;
        }
        if (otherSpec.getStemSize() == 0) {
            k = true;
        }
        else if (stemSize != otherSpec.getStemSize()) {
            return false;
        }
        return k;
    }

    public void setType(FlowerType type) {
        this.type = type;
    }

    public FlowerType getType() {
        return type;
    }

    public void setStemSize(double stemSize) {
        this.stemSize = stemSize;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public int getFreshness() {
        return freshness;
    }

    public FlowerColor getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public double getStemSize() {
        return stemSize;
    }

    public String toString() {
        return this.getColor().toString() + this.getType().toString();
    }
}
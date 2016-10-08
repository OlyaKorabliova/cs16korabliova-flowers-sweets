package com.korabliova.study.home_tasks;

/**
 * Created by Olia on 06.10.2016.
 */
public class Sweets {
    protected String producer = "";
    protected double weight = 0;
    protected int sweetness = 5;
    protected String name = "";
    protected double price = 0;

    public int getSweetness() {
        return sweetness;
    }

    public void setSweetness(int sweetness) {
        this.sweetness = sweetness;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name + "(" + this.producer + ")";
    }

}

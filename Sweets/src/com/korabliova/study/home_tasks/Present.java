package com.korabliova.study.home_tasks;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Olia on 06.10.2016.
 */
public class Present {

    // class of our present

    private Sweets[] swts = new Sweets[0];      //an array of sweets
    private int lastIndex = 0;
    private double sum_price = 0;
    private double sum_weight = 0;
    
    public void addSweet(Sweets sweet){
        // adds a new sweet to our present
            Sweets[] newSwts;
            newSwts = Arrays.copyOf(swts, swts.length + 1);
            swts = newSwts;
            swts[lastIndex] = sweet;
            lastIndex++;
    }

    public double countPrice(){
        //counts price of our present
        for (int i = 0; i < swts.length; i++){
            sum_price += swts[i].price;
        }
        return sum_price;
    }

    public double countWeight(){
        //counts weight of our present
        for (int i = 0; i < swts.length; i++){
            sum_weight += swts[i].weight;
        }
        return sum_weight;
    }

    public String findSweetBySweetnessLevel(double range1, double range2){
        //finds a sweet by its sweetness level
        for (int i = 0; i < swts.length; i++){
            if (range1 < swts[i].sweetness && swts[i].sweetness <= range2){
                return swts[i].name + " (" + swts[i].producer + ")";
            }
        }
        return "Present has no sweets with such sweetness level :(";
    }

    public String sort(){
        //sort by choosen parameter
        System.out.println("1. Sort by weight");
        System.out.println("2. Sort by sweetness");
        System.out.println("3. Sort by price");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1){    //if you choose to sort by weight
            this.sortByWeight();
        }
        else if (n == 2){       //if you choose to sort by sweetness
            this.sortBySweetness();
        }
        else if (n == 3){       //if you choose to sort by price
            this.sortByPrice();
        }
        else{
            this.sort();
        }
        return ":)";
    }

    public String sortByWeight(){
        //sorts candies in the present by weight
        Arrays.sort(swts, (a, b) -> Double.compare(a.weight, b.weight));
        return Arrays.toString(swts);
    }

    public String sortBySweetness(){
        //sorts candies in the present by sweetness
        Arrays.sort(swts, (a, b) -> Integer.compare(a.sweetness, b.sweetness));
        return Arrays.toString(swts);
    }

    public String sortByPrice(){
        //sorts candies in the present by price
        Arrays.sort(swts, (a, b) -> Double.compare(a.price, b.price));
        return Arrays.toString(swts);
    }

    public String toString(){
        return Arrays.toString(swts);
    }

}

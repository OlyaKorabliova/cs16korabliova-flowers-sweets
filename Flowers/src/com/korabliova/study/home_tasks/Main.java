package com.korabliova.study.home_tasks;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tulips tul1 = new Tulips(10, 20.75, 3, "red");
        Tulips tul2 = new Tulips(5, 12, 4, "yellow");
        Tulips tul3 = new Tulips(8, 18, 1, "blue");

        Roses rose1 = new Roses(15, 25, 5, "white");
        Roses rose2 = new Roses(12, 20, 4, "yellow");
        Roses rose3 = new Roses(15, 25, 3, "red");

        Chamomiles cham1 = new Chamomiles(13.4, 7.5, 4, "white");
        Chamomiles cham2 = new Chamomiles(10.5, 5.5, 0, "pink");
        Chamomiles cham3 = new Chamomiles(17, 10, 5, "blue");

        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(tul1);
        bouquet.addFlower(rose1);
        bouquet.addFlower(cham3);
        bouquet.addFlower(tul2);
        bouquet.addFlower(tul3);
        bouquet.addFlower(cham1);
        bouquet.addFlower(rose2);
        bouquet.addFlower(tul1);
        bouquet.addFlower(cham2);
        bouquet.addFlower(rose3);
        bouquet.addFlower(rose1);
        System.out.println(bouquet);
        System.out.println(bouquet.countPrice());
        System.out.println(bouquet.findFlowerByStemSize(0, 1));
        System.out.println(bouquet.findFlowerByStemSize(0, 15));
        System.out.println(bouquet.sortFlowers());

    }
}

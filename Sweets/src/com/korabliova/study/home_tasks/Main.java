package com.korabliova.study.home_tasks;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Romashka rom1 = new Romashka("Roshen", 1.5, 3, 10);
        Romashka rom2 = new Romashka("ABK", 0.8, 2, 8.5);
        Romashka rom3 = new Romashka("Svitoch", 0.45, 4, 4.6);

        ZorianeSiayvo zs1 = new ZorianeSiayvo("Roshen", 2.3, 4, 15);
        ZorianeSiayvo zs2 = new ZorianeSiayvo("ABK", 0.56, 1, 5.5);
        ZorianeSiayvo zs3 = new ZorianeSiayvo("Svitoch", 1.2, 0, 6.7);

        Lollipops lol1 = new Lollipops("Roshen", 1.098, 4, 6.45);
        Lollipops lol2 = new Lollipops("ABK", 0.666, 2, 7);
        Lollipops lol3 = new Lollipops("Svitoch", 1.1, 3, 4.5);

        Present present = new Present();
        present.addSweet(rom1);
        present.addSweet(zs1);
        present.addSweet(lol3);
        present.addSweet(rom2);
        present.addSweet(rom3);
        present.addSweet(lol2);
        present.addSweet(zs2);
        present.addSweet(rom1);
        present.addSweet(lol1);
        present.addSweet(zs3);
        present.addSweet(zs1);
        System.out.println(present);
        System.out.println(present.countPrice());
        System.out.println(present.countWeight());
        System.out.println(present.findSweetBySweetnessLevel(5, 5));
        System.out.println(present.findSweetBySweetnessLevel(1, 15));
        System.out.println(present.sort());
        System.out.println(present);

    }
}

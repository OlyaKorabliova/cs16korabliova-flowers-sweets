package com.korabliova.study.home_tasks;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FlowerSpec spec1 = new FlowerSpec(FlowerType.TULIP, 5, FlowerColor.RED, 12, 6.8);
        FlowerSpec spec2 = new FlowerSpec(FlowerType.ROSE, 4, FlowerColor.BLUE, 8, 18);
        FlowerSpec spec3 = new FlowerSpec(FlowerType.CHAMOMILE, 5, FlowerColor.YELLOW, 10, 7.9);
        FlowerSpec spec4 = new FlowerSpec(FlowerType.TULIP, 3, FlowerColor.WHITE, 0, 7);

        OneFlower flw1 = new OneFlower(spec1);
        OneFlower flw2 = new OneFlower(spec2);
        OneFlower flw3 = new OneFlower(spec3);
        OneFlower flw4 = new OneFlower(spec4);
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(flw1, flw2, flw4, flw3);

        System.out.println(bouquet);

        System.out.println(bouquet.countPrice());
        System.out.println(bouquet.findFlowerByStemSize(0, 1));
        System.out.println(bouquet.findFlowerByStemSize(0, 15));
        System.out.println(bouquet.sortFlowers());

        System.out.println(bouquet.search(new FlowerSpec(FlowerType.NO_TYPE, 4, FlowerColor.NO_COLOR, 0, 0)));
        System.out.println(bouquet.search(new FlowerSpec(FlowerType.NO_TYPE, 5, FlowerColor.NO_COLOR, 0, 0)));
        System.out.println(bouquet.search(new FlowerSpec(FlowerType.TULIP, 0, FlowerColor.NO_COLOR, 0, 0)));


    }
}

package com.company.HomeWork16;

public class CarRun {
    public static void main(String[] args) {
        Car minivan = new Car(7,60,21);
        Car sportcar = new Car(2,70,14);
        int range1, range2, dist = 125;

//        minivan.setCar(7,60,21);
//        sportcar.setCar(2,70,14);

//        minivan.passengers = 7;
//        minivan.fuelTank = 60;
//        minivan.consuption = 21;
//
//        sportcar.passengers = 2;
//        sportcar.fuelTank = 70;
//        sportcar.consuption = 14;




//        range1 = minivan.fuelTank / minivan.consuption * 100;
//        range2 = sportcar.fuelTank / sportcar.consuption * 100;
//        System.out.println("Минивен может перевезти" + minivan.passengers
//                + " пассажиров на расстояние " + minivan.range() + "км");
//
//        System.out.println("Спорткар может перевезти" + sportcar.passengers
//                + " пассажиров на расстояние " + sportcar.range() + "км");
        System.out.println("Для преодалния " +dist+ " минивену понадобиться "
                + minivan.fuelNeed(dist)+ "литров топлива");
        System.out.println("Для преодалния " +dist+ " спорткару понадобиться "
                + sportcar.fuelNeed(dist)+ "литров топлива");
        //minivan.init();
    }
}

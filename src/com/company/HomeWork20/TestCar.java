package com.company.HomeWork20;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car(10,20);
        Car car1 = new Car(100,200);
        Player player = new Player("Petya","Petrov");

        player.setCar(car);
        car.setPlayer(player);
        car1.setPlayer(player);
        //car.forward(100);

        player.printCoord();
        System.out.println("Car = " + car.getPlayer() +" \nCar1 = "+ car1.getPlayer());
        System.out.println("Player + " + player.getCar());





    }
}

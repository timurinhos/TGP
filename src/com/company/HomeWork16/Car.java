package com.company.HomeWork16;

import java.util.Scanner;

public class Car {
    int passengers;
    int fuelTank;
    int consuption;

    public Car() {
    }

    public Car(int passengers, int fuelTank, int consuption) {
        this.passengers = passengers;
        this.fuelTank = fuelTank;
        this.consuption = consuption;
    }


    //    public void setCar(int p, int f, int c) {
//        passengers = p;
//        fuelTank = f;
//        consuption = c;
//    }


    public void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество пассажиров");
        passengers = scanner.nextInt();

    }

    public int range() {
        return (fuelTank * 100) / consuption;
    }

    public double fuelNeed(int km) {
        return (double) (consuption * km) / 100;
    }
}
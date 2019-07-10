package com.company.HomeWork5;
//Даны 3 целых числа. Вывести на экран те из них, которые являются четными.
import java.util.Random;
public class ThreeNumbers4 {


    public static void main(String[] args) {
        Random run = new Random();
        int x = run.nextInt(999);
        int y = run.nextInt(999);
        int k = run.nextInt(999);
        x += 10;
        y += 10;
        k += 10;

        if (x % 2 == 0){
            System.out.println("Это число четное: " + x);
        }else if (y % 2 == 0){
            System.out.println("Это число четное: " + y);
        }else if (k % 2 == 0){
            System.out.println("Это число четное: " + k);
        }else {
            System.out.println("Ни одно число не является четным!");
        }
    }
}

package com.company.HomeWork5;
import java.util.Random;
//Пользователь вводит любое целое число (0-999). Определить:
//a.Сколько цифр в числе (вывести результат)
//b.Положительное или отрицательное число
public class ThreeNumbers2 {
    public static void main(String[] args) {
        Random run = new Random();
        int x = run.nextInt(899);
        x += -100;

        if (x <= 0) {
            System.out.println("число отрицательное: " + x);
        } else {
            System.out.println("число положительное: " + x);
        }

        if (x < 1000 && x > 100) {
            System.out.println("цифр в числе - 3 ");
        }else if (x < 100 && x > 10){
            System.out.println("цифр в числе - 2 ");
        }else if (x < 10 && x > 0) {
            System.out.println("цифр в числе - 1 ");
        }


    }
}

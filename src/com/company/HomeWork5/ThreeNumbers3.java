package com.company.HomeWork5;
import java.util.Random;
//Дано трехзначное число. Определить:
//a.Верно ли, что его цифры одинаковые?
//b.Определить, есть ли среди его цифр одинаковые.
public class ThreeNumbers3 {

    public static void main(String[] args) {
        Random run = new Random();
        int x = run.nextInt(899);
        x += 100;
        int first = x / 100;
        int second = x / 10 % 10;
        int third = x % 10;

        if (first == second || first == third || second == third) {
            System.out.println("В числе есть одинкавоые цифры: " + x);
        } else {
            System.out.println("В числе нет одинаковых цифр: " + x);
        }
    }
}

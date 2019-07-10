package com.company.HomeWork5;
//Дано трехзначное число. Определить какая из его цифр больше:
//a.Первая или последняя
//b.Первая или вторая
//c.Вторая или последняя
import java.util.Random;
public class HaveThreeN {


    public static void main(String[] args) {

        Random run = new Random();
        int x = run.nextInt(899);
        x += 100;

        int first = x / 100;
        int second = x / 10 % 10;
        int third = x % 10;

        if (first > third) {
            System.out.println("первая больше третей: " + x);
        }else if (first > second){
            System.out.println("первая больше чем вторая: " + x);
        }else if (second > third){
            System.out.println("Вторая больше чем третья: " + x);
        }
    }
}

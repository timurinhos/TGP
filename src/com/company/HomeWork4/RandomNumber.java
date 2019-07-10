package com.company.HomeWork4;
//4.Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру. (Используем класс Math или Random)
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random ran = new Random();
        int a = ran.nextInt(899);
        a += 100;
        int first = a / 100;
        int second1 = a / 10;
        int second = second1 % 10;
        int third = a % 10;
        if (first > second && first > third) {
            System.out.println (first);
        } else if (second > first && second > third) {
            System.out.println (second);
        } else {
            System.out.println (third);
        }
        System.out.println (a);
            }
        }
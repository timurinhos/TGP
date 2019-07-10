package com.company.HomeWork2;
//Задание 2. Дана сторона квадрата. Найти его переметр.
//Задание 3. Дан радиус окружности найти его диаметр.
//Задание 4. Дано двухзначное число. Найти:
//А) число десятков в нем;
//Б) число единиц в нём;
//В) сумму его цифр;
//Г) произведение его цифр.
public class Find {

    public static void main(String[] args){

        int h = 3;
        int p = 4*h;

        System.out.println("Периметр квадрата:" +" "+ + p + "\n");

        int r = 9;
        int d = 2*r;

        System.out.println("Диаметр окружности:" +" "+ + d + "\n");

        int n = 26;
        int des = 2;
        int yead = 6;
        int sum = des + yead;
        int pro = Math.multiplyExact(des, yead);

        System.out.println("двухзначное число: " + n);
        System.out.println("число десятков в нем: " + des);
        System.out.println("число единиц в нём: " + yead);
        System.out.println("сумму его цифр: " + sum);
        System.out.println("произведение его цифр: " + pro);






    }
}

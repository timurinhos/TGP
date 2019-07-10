package com.company.HomeWork3;
//Даны целые числа h,m,s(0<h<=23, 0<=m<=59,0<=s<=59), указывающие момент времени h часов, m минут, s секунд. Определить угол(в градусах) между положением часовой стрелки в начале суток и в указанный момент времени
import java.util.Scanner;
public class TimeCorner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во часов:");
        float h = scan.nextFloat();
        System.out.println("Введите кол-во минут:");
        float m = scan.nextFloat();
        System.out.println("Введите кол-во секунд:");
        float s = scan.nextFloat();
        scan.close();

        h = (h / 12) * 3600;
        m = m * 60;
        s = (h + m + s) / 12 / 3600 * 360;

        System.out.println("Ваш ответ: " + s);
        double corner; double circle = 360; double hour = circle / 12; double minute = hour / 60; double second = minute / 60; corner = (hour * h) + (minute * m) + (second * s);




    }
}

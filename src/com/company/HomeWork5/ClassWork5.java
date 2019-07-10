package com.company.HomeWork5;
import java.util.Scanner;
public class ClassWork5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите точку x: ");
        float x = scan.nextFloat();
        System.out.println("Введите точку y: ");
        float y = scan.nextFloat();


        if (x <= -2 && y >= 1) {
            System.out.println("Точка в зоне");
        }else {
            System.out.println("Вы не попали");
        }

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите точку x: ");
        float x1 = scan1.nextFloat();
        System.out.println("Введите точку y: ");
        float y1 = scan1.nextFloat();


        if (y1 >= -2 && y1 <= 1.5) {
            System.out.println("Точка в зоне");
        } else {
            System.out.println("Вы не попали");
        }

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите точку x: ");
        float x2 = scan2.nextFloat();
        System.out.println("Введите точку y: ");
        float y2 = scan2.nextFloat();


        if (y2 <= -1 && x2 >= 1 || y2 ==0 && x2 >= 2) {
            System.out.println("Точка в зоне");
        } else {
            System.out.println("Вы не попали");
        }

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Введите точку x: ");
        float x3 = scan3.nextFloat();
        System.out.println("Введите точку y: ");
        float y3 = scan3.nextFloat();


        if (y3 >= 2 || y3 <= 4 && x3 >= 1) {
            System.out.println("Точка в зоне");
        } else {
            System.out.println("Вы не попали");
        }

        Scanner scan4 = new Scanner(System.in);
        System.out.println("Введите точку x: ");
        float x4 = scan4.nextFloat();
        System.out.println("Введите точку y: ");
        float y4 = scan4.nextFloat();


        if (y4 <= -1.5 || y4 >= 1 && x4 >= 2) {
            System.out.println("Точка в зоне");
        } else {
            System.out.println("Вы не попали");
        }
        scan.close();
        scan1.close();
        scan2.close();
        scan3.close();
        scan4.close();

    }
}

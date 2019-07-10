package com.company.HomeWork4;
import java.util.Random;
import java.util.Scanner;
//5.	Сгенерируйте число от 0 до 100. Пользователь должен угадать полученное число за 7 попыток. После каждой попытки выводим сообщение «Мало» или «Много» (подсказка для пользователя). Если после семи попыток пользователь не смог угадать число, сообщите ему о проигрыше и какое число было загадано
public class TrySeven {
    public static void main(String[] args) {
        Random ran = new Random();
        int a = ran.nextInt(100);
        String many = "Много";
        String little = "Мало";
        Scanner scan = new Scanner(System.in);
        System.out.println("Угадайте число от 0 до 100:");
        int a1 = scan.nextInt();

        if (a1 == a) {
            System.out.println("Вы угадали");
        } else if (a1 > a) {
            System.out.println(many);
        } else {
            System.out.println(little);
        }

        int a2 = scan.nextInt();
        if (a2 == a) {
            System.out.println("Вы угадали");
        } else if (a2 > a) {
            System.out.println(many);
        } else {
            System.out.println(little);
        }

        int a3 = scan.nextInt();
        if (a3 == a) {
            System.out.println("Вы угадали");
        } else if (a3 > a) {
            System.out.println(many);
        } else {
            System.out.println(little);
        }

        int a4 = scan.nextInt();
        if (a4 == a) {
            System.out.println("Вы угадали");
        } else if (a4 > a) {
            System.out.println(many);
        } else {
            System.out.println(little);
        }

        int a5 = scan.nextInt();
        if (a5 == a) {
            System.out.println("Вы угадали");
        } else if (a5 > a) {
            System.out.println(many);
        } else {
            System.out.println(little);
        }

        int a6 = scan.nextInt();
        if (a6 == a) {
            System.out.println("Вы угадали");
        } else if (a6 > a) {
            System.out.println(many);
        } else {
            System.out.println(little);
        }

        int a7 = scan.nextInt();
        if (a7 == a) {
            System.out.println("Вы угадали =) ");
        } else System.out.println("Вы не угадали =( Загадонное число: " + a);
        scan.close();
        }
    }


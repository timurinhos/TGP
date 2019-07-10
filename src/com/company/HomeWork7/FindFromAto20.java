package com.company.HomeWork7;
//Найти:
//Произведение всех чисел от a до 20 (значение a вводится с клавиатуры; 1 <= a <= 20)
//Произведение всех чисел от 1 до b (значение b вводится с клавиатуры; 1 <= b <= 20)
import java.util.Scanner;
public class FindFromAto20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число а, при условии 1 <= a <= 20:");
        long a = scan.nextLong();

        long m = 1;
        for (long i = a; i <= 20; i++) {

            m = m * i;
            System.out.println(m);
        }

        System.out.println();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите число b, при условии 1 <= b <= 20:");
        long b = scan.nextLong();

        long m1 = 1;
        for (long i = 1; i <= b; i++) {

            m1 = m1 * i;
            System.out.println(m1);
        }
        scan.close();
        scan1.close();
    }
}

package com.company.HomeWork6;
//Вывести на экран ряд чисел Фибоначчи, состоящий из n элементов. Числа Фибоначчи – это элементы числовой последовательности 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144…
import java.util.Scanner;
public class FibonacciNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во элементов:");
        int n = scan.nextInt();
        scan.close();

        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < n; i++) {
            c = b;
            b = a;
            a = b + c;
            System.out.print(a +" ");
        }
    }
}

package com.company.HomeWork7;
//Дано натуральное число. Определить максимальную и минимальную цифру.
import java.util.Scanner;
public class NumberNMaxAndMin {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int n = scan.nextInt();
        scan.close();
        int max, min;
        min = 10;
        max = -10;

        while (n > 0) {
            if (n % 10 > max){
                max = n % 10;
            }
            if (n % 10 < min){
                min = n / 10;
            }
            n = n / 10;
        }
        System.out.println("Минимальное " + min);
        System.out.println("Максимальное " + max);
    }
}

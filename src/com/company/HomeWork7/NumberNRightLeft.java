package com.company.HomeWork7;
import java.util.Scanner;
//Запросить у пользователя натуральное число n. Найти число получаемое при прочтении его цифр справа налево
public class NumberNRightLeft {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int n = scan.nextInt();
        scan.close();

        int b;
        int c = 0;
        while (n > 0) {
            b = n % 10;
            c = c * 10 + b;
            n = n / 10;
        }
        System.out.print(c);
    }
}

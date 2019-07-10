package com.company.HomeWork7;
//Запросить у пользователя натуральное число n. Вывести в консоль все его цифры через пробел.
import java.util.Scanner;
public class NNumberN {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int n = scan.nextInt();
        scan.close();

        while (n > 0) {
            System.out.print(n % 10 +" ");
            n = n / 10;

        }
    }
}

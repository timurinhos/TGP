package com.company.HomeWork7;
//Напечатать таблицу умножения на число n (значение n вводится с клавиатуры 1 <= n <= 9)
import java.util.Scanner;
public class TableN {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любую цифру:");
        int x = scan.nextInt();
        scan.close();

        int result;
        int Y = x;
        for (int i = 1; i < 10; i++) {
            result = i * x;
            System.out.println(i + " x " + Y + " = " + result);
        }
    }
}

package com.company.HomeWork6;
//b.Сумму всех целых чисел от a до 500 (значение a вводится с клавиатуры a <= 500);
//c.Сумму всех четных чисел от a до b (значение a и b вводится с клавиатуры b >= a);
//d.Среднее арифметическое всех целых чисел от a до b (значение a и b вводится с клавиатуры b >= 100);
import java.util.Scanner;
public class FindSumFrom100to500PartTwo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое число:");
        int a = scan.nextInt();

        int sum = 0;
        for (int i = a; i <= 500; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
        System.out.println(" ");

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите любое число:");
        int a1 = scan.nextInt();
        System.out.println("Введите еще раз любое число:");
        int b = scan.nextInt();

        int sum1 = 0;
        for (int i = a1; i <= b; i++) {
            sum1 = sum1 + i;
            if (sum1 % 2 == 0) {
                System.out.println(sum1);
            }
        }

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите любое число:");
        int a2 = scan.nextInt();
        System.out.println("Введите еще раз любое число:");
        int b1 = scan.nextInt();

        int sum2 = 0;
        int k = 0;
        int s = 0;
        for (int i = a2; i <= b1; i++) {
            sum2 = sum2 + i;
            k = k + 1;
            s = sum2 / k;
            System.out.println(s);
            }

        scan.close();
        scan1.close();
        scan2.close();
        }

}


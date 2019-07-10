package com.company.HomeWork5;
//Дано натуральное число. Определить:
//a.Является ли оно четным
//b.Оканчивается ли оно цифрой 7
import java.util.Scanner;

public class ClassWork5_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое число");
        int x = scan.nextInt();

        if (x % 2 == 0) {
            System.out.println("число четное");

        }else
                System.out.println("число не четное");

        if (x % 10 == 7) {
            System.out.println("Число заканчивается на 7");
        }

        scan.close();
    }

}



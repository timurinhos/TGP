package com.company.HomeWork13;
//3)Даны два натуральных числа. Выяснить, в каком из них сумма цифр больше.
//Определить метод для расчета суммы цифр натурального числа.
import java.util.Scanner;
public class MethodTwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое натуральное число:");
        int a = scan.nextInt();
        System.out.println("Введите второе натуральное число:");
        int b = scan.nextInt();
        scan.close();

        int firsta = a / 10;
        int seconda = a % 10;
        int firstb = b / 10;
        int secondb = b % 10;
        int thirda  = 0;
        int thirdb = 0;

        if (a >= 100 && b >=100){
            firsta = a / 100;
            seconda = a / 10 % 10;
            thirda = a % 10;
            firstb = b / 100;
            secondb = b / 10 % 10;
            thirdb = b % 10;
        }

        sumA(firsta,  seconda, thirda);
        sumB(firstb,  secondb, thirdb);

        if (sumA(firsta,  seconda, thirda) == sumB(firstb,  secondb, thirdb)){
            System.out.println("сумма цифр в обеих числах равны!");
        }
        if (sumA(firsta,  seconda, thirda) > sumB(firstb,  secondb, thirdb)){
            System.out.println("В первом числе сумма цифр больше чем во втором!");
        }
        if (sumA(firsta,  seconda, thirda) < sumB(firstb,  secondb, thirdb)){
            System.out.println("Во втором числе сумма цифр больше чем в первом!");
        }

    }

    private static int sumA (int  firsta, int seconda, int thirda){

        return firsta + seconda + thirda;

    }

    private static int sumB (int  firstb, int secondb, int thirdb){

        return firstb + secondb + thirdb;

    }

}

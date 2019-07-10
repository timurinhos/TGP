package com.company.HomeWork13;
//4)Даны натуральные числа a и b. Найти их наименьшее общее кратное. (Определить метод для расчета наибольшего общего делителя двух натуральных чисел, используя алгоритм Евклида.)
import java.util.Scanner;
public class MethodAB {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое натуральное число:");
        int a = scan.nextInt();
        System.out.println("Введите второе натуральное число:");
        int b = scan.nextInt();
        scan.close();

        int r = (EVK(a, b));
        int no = (b * a) / r;

        System.out.println("Наименьшее общее кратное = " + no);


    }

    private static int EVK(int n, int m){

        while (n != 0 && m != 0){
            if (n >= m) {
                n = n % m;
            }else {
                m = m % n;
            }
        }

       return 1;
    }

}

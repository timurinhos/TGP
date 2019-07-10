package com.company.HomeWork7;
//Дано число n. Из чисел 1, 4, 7, 10, 13, ... (до заданного вами числа)  напечатать те, которые не превышают n.
import java.util.Scanner;
public class NumberN147 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int n = scan.nextInt();
        scan.close();
        int i = 1;
        while (i < 37 && i < n) {
            System.out.print(i +" ");
            i += 3;
        }

    }

}

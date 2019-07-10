package com.company.HomeWork7;
import java.util.Scanner;
public class ClassWork7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое число:");
        int x = scan.nextInt();
        scan.close();
        do {
            x++;
        }
        while (x / 10 > 0); {
            System.out.println("Одна цифра ");
            }
        }
    }


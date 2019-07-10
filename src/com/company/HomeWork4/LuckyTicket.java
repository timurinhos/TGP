package com.company.HomeWork4;
//Написать программу, которая запрашивает у пользователя номер билетика (шестизначное число). Определить является ли билет счастливым (сумма первых трёх чисел, должна быть равна последним трём).
//Если билетик счастливый вывести на экран сообщение: «Везунчик! Твой билетик счастливый ». В противном случае: «Увы! Ваш билет не счастливый »
import java.util.Scanner;
public class LuckyTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую цыфру билета:");
        int a = scan.nextInt();
        System.out.println("Введите вторую цыфру билета:");
        int b = scan.nextInt();
        System.out.println("Введите третью цыфру билета:");
        int c = scan.nextInt();
        System.out.println("Введите четвертую цыфру билета:");
        int d = scan.nextInt();
        System.out.println("Введите пятую цыфру билета:");
        int e = scan.nextInt();
        System.out.println("Введите шестую цыфру билета:");
        int f = scan.nextInt();

        if (a + b + c == d + e + f) {
            System.out.println("Везунчик, твой билет счастливый \uF04A");
        }else {
            System.out.println("Увы! Ваш билет не счастливый \uF04C");
        }
        scan.close();
        }


    }

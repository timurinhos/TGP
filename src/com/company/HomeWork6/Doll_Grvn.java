package com.company.HomeWork6;
//Напечатать таблицу перевода 1, 2 ... 20 долларов США в гривны по текущему курсу (значение курса вводится с клавиатуры).
import java.util.Scanner;
public class Doll_Grvn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара по отношению к гривне:");
        float k = scan.nextFloat();
        scan.close();
        for (int i = 1; i <= 20; i++) {
            float sum = i * k;
            System.out.println(i + " Доллар(а,ов) " + " = \t" + sum +" Грн");
            }
            System.out.println(" ");
        }
    }


package com.company.HomeWork2;
import java.util.Scanner;

//Задание 1. Значение x и a запрашиваем у юзера при помощи сканера.
public class ValueXandA {

    public static void main(String[] args){



      System.out.println("Введите значение x: ");
      Scanner scan = new Scanner(System.in);
      int x = scan.nextInt();

      System.out.println("y = " + (7*x^2-3*x+6));

      System.out.println("Введите значение a: ");
      Scanner scan1 = new Scanner(System.in);
      int a = scan1.nextInt();


      System.out.println("x = " + (12*a^2+7*a-16));
      scan.close();
      scan1.close();


    }


}

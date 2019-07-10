package com.company.HomeWork12;
//5. Написать функцию, которая возвращает истину, если передаваемое значение положительное и ложь, если отрицательное.
import java.util.Scanner;
public class MethodTrueORFalse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        float a = scan.nextFloat();
        scan.close();



        if (a >= 0) {
            System.out.println(b1(a));
        }else {
            System.out.println(b2(a));
        }

    }

    private static boolean b1(float a) {

        return true;

    }
    private static boolean b2(float a){

        return false;

    }
}



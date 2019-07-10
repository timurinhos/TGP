package com.company.HomeWork5;
import java.util.Scanner;
//Дан отрезок от 0 до 100, который разделён на 4 сектора (A, B, C, D). Пользователь вводит число. Определить на каком отрезке, в каком секторе, находится число:
//A - [0; 25)
//B – [25; 50)
//C – [50; 75)
//D – [75; 100]
public class Sectors {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int x = scan.nextInt();

        if (x >= 0 && x <= 25) {
            System.out.println("Вы в секторе А!");
        } else if (x >= 25 && x <= 50) {
            System.out.println("Вы в секторе B!");
        } else if (x >= 50 && x <= 75) {
            System.out.println("Вы в секторе C!");
        } else if (x >= 75 && x <= 100) {
            System.out.println("Вы в секторе D!");
        }else {
            System.out.println("Вы не где!");
        }

    }
}

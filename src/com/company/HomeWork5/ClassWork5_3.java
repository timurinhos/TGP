package com.company.HomeWork5;
//Дано двузначное число. Определить:
//a.Какая из его цифр больше: первая или вторая
//b.Одинаковы ли его цифры
import java.util.Scanner;
public class ClassWork5_3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите двухзначное число:");
        int x = scan.nextInt();


        if ((x / 10) > (x % 10)) {
            System.out.println("первая цифра больше");
        }else if ((x / 10) < (x % 10)){
            System.out.println("вторая цифра больше");
        } else if ((x / 10) == (x % 10)) {
            System.out.println("цифры равны");
        }

scan.close();
    }

}

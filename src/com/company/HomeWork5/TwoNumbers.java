package com.company.HomeWork5;
//3.Дано двузначное число. Определить:
//a.Является ли сумма его цифр двузначным числом
//b.Больше ли числа a сумма его цифр (не совсем логично, но пусть будет)
import java.util.Random;
public class TwoNumbers {

    public static void main(String[] args) {

        Random run = new Random();
        int y = run.nextInt(99);


        if ((y / 10) + (y % 10) > 9) {
            System.out.println("сумма цифр двухзначная " + y);
        }else {
            System.out.println("нечего ");
        }





    }

}

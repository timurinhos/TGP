package com.company.HomeWork6;
//Игра Угадайка. Сгенерируйте число от 0 до 100. Пользователь должен угадать полученное число за 7 попыток. После каждой попытки выводим сообщение «Мало» или «Много» (подсказка для пользователя). Если после семи попыток пользователь не смог угадать число, сообщите ему о проигрыше и какое число было загадано.
import java.util.Random;
import java.util.Scanner;
public class GuessNumber {

    public static void main(String[] args) {
        Random ran = new Random();
        int a = ran.nextInt(100);

        Scanner scan = new Scanner(System.in);
        System.out.println("Угадайте число от 0 до 100:");
        int a1 = scan.nextInt();

        if (a != a1) {
            for (int i = 1; i < 7; i++) {
                if (a > a1) {
                    System.out.println("Мало");
                    Scanner scan1 = new Scanner(System.in);
                    int a2 = scan1.nextInt();
                    a1 = a2;
                }
                else if (a < a1) {
                    System.out.println("Много");
                    Scanner scan2 = new Scanner(System.in);
                    int a3 = scan2.nextInt();
                    a1 = a3;
                }
            }
        if (a == a1) {
            System.out.println("Вы угадали)");
           }
        }
        if (a != a1) {
            System.out.println("Вы не угадали( загаданное число: " + a);
        }
        scan.close();
    }
}

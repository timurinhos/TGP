package com.company.HomeWork14;
//Напишите Java-метод, чтобы проверить, является ли строка допустимым паролем.
//Правила пароля:
//пароль должен содержать не менее десяти символов.
//Пароль состоит только из букв и цифр.
//Пароль должен содержать не менее двух цифр.

import java.util.Scanner;
public class ClassWork_14 {

    public static void main(String[] args) {

        lettersAndNumbers();

    }

    static void lettersAndNumbers(){

        Scanner scan = new Scanner(System.in);

        int i = 1;
        while (i > 0) {
            System.out.print("\nВведите пароль: ");
            String pass = scan.nextLine();
            if (pass.length() >= 8 && pass.length() <= 100 && pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') {
                System.out.print("Пароль действителен: " + pass);
                break;
            }
            else {
                System.out.print("Пароль введен неверно!");
            }

            i++;
        }
        scan.close();
    }

}

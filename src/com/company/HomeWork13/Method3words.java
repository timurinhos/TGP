package com.company.HomeWork13;
//6) Даны три слова. Выяснить, является ли хоть одно из них палиндромом (“перевертышем”), т.е. таким, которое читается одинаково слева на право и справа налево. (Определить функцию, позволяющую распознать слова-палиндромы.)

public class Method3words {

    public static void main(String[] args) {

        String str1 = "Дача";
        String str2 = "машина";
        String str3 = "еще";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);


        if (isPalindrom(str1)){
            System.out.println("Палиндром");
        }
        else {
            System.out.println("Не палиндром");
        }

        if (isPalindrom(str2)){
            System.out.println("Палиндром");
        }
        else {
            System.out.println("Не палиндром");
        }

        if (isPalindrom(str3)){
            System.out.println("Палиндром");
        }
        else {
            System.out.println("Не палиндром");
        }

    }

    static boolean isPalindrom(String str) {

        int n = str.length();
        for (int i = 0; i < str.length() / 2;  i++) {
            if (str.charAt(i) != str.charAt(n - 1))
                return false;
            n--;
        }
        return true;
    }
}




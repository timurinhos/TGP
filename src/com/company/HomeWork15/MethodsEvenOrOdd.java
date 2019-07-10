package com.company.HomeWork15;
import java.util.Scanner;
//2)Пользователь вводит слово. Сделать проверку на то чтобы слово состояло из четного числа букв. Поменять местами его половины.
public class MethodsEvenOrOdd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любое слово: ");
        String str1 = scan.nextLine();
        scan.close();
        EvenOrOdd(str1);

    }

    static void EvenOrOdd(String str1){

        if (str1.length() % 2 == 0){
            System.out.println("В даном слове четное количество букв");
        }else {
            System.out.println("В даном слове нечетное количество букв");
        }

        if (str1.length() == 2){
            System.out.print(str1.charAt(1));
            System.out.print(str1.charAt(0));
        }
        if (str1.length() == 4){
            System.out.print(str1.charAt(2));
            System.out.print(str1.charAt(3));
            System.out.print(str1.charAt(0));
            System.out.print(str1.charAt(1));
        }
        if (str1.length() == 6){
            System.out.print(str1.charAt(3));
            System.out.print(str1.charAt(4));
            System.out.print(str1.charAt(5));
            System.out.print(str1.charAt(0));
            System.out.print(str1.charAt(1));
            System.out.print(str1.charAt(2));
        }
        if (str1.length() == 8){
            System.out.print(str1.charAt(4));
            System.out.print(str1.charAt(5));
            System.out.print(str1.charAt(6));
            System.out.print(str1.charAt(7));
            System.out.print(str1.charAt(0));
            System.out.print(str1.charAt(1));
            System.out.print(str1.charAt(2));
            System.out.print(str1.charAt(3));
        }
        if (str1.length() == 10){
            System.out.print(str1.charAt(5));
            System.out.print(str1.charAt(6));
            System.out.print(str1.charAt(7));
            System.out.print(str1.charAt(8));
            System.out.print(str1.charAt(9));
            System.out.print(str1.charAt(0));
            System.out.print(str1.charAt(1));
            System.out.print(str1.charAt(2));
            System.out.print(str1.charAt(3));
            System.out.print(str1.charAt(4));
        }

    }

}

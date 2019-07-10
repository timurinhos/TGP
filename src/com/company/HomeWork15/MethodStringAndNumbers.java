package com.company.HomeWork15;
import java.util.Scanner;
//3)Пользователь вводит текст, в котором имеются несколько идущих подряд цифр. Написать метод, который получает число, образованное этими цифрами (сделать проверку на наличие цифр в тексте, вывести первые идущие подряд цифры, остальные не нужно).
public class MethodStringAndNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любой текст с идущими подряд цифрами: ");
        String str1 = scan.nextLine();
        scan.close();

        getNumbers(str1);

    }

    static void getNumbers(String str1){

        int i;
        for (i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9'){
                System.out.println("В тексте есть цифры");
                break;
            }
        }

        if (str1.charAt(i) < '0' && str1.charAt(i) > '9'){
            System.out.println("В тексте нет цифр");
        }
        char n = 0;
        char n1 = 0;
        for (int j = 0; j < str1.length(); j++) {
            if (str1.charAt(j) >= '0' && str1.charAt(j) <= '9'){
                n = str1.charAt(j);
                n1 = str1.charAt(j + 1);
                System.out.print("Первые подряд идущие цифры: " + n);
                System.out.print(n1);
                break;
            }
        }
    }
}

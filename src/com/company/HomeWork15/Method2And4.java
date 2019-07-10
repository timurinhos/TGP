package com.company.HomeWork15;
import java.util.Scanner;
//1)Написать метод, который получает слово и определяет одинаковы ли второй и четвертый символы в нем.
public class Method2And4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любое слово: ");
        String str1 = scan.nextLine();
        scan.close();
        Index(str1);

    }

    static void Index(String str1){

       if (str1.charAt(1) == str1.charAt(3)){
           System.out.println("Второй и четвертый символ совпадают!");
       }else {
           System.out.println("Второй и четвертый символ не совпадают!");
       }

    }
}

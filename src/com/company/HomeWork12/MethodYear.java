package com.company.HomeWork12;
//3. Напишите метод, чтобы проверить, является ли год (целое число), введенным пользователем, високосным годом или нет.
import java.util.Scanner;
public class MethodYear {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите год: ");
        int a = scan.nextInt();
        scan.close();
        Year(a);



    }
    static void Year(int a){

        if (a % 4 == 0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }



    }
}

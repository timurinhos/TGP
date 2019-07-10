package com.company.HomeWork4;
import java.util.Scanner;
public class Enter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scan.nextInt();
        System.out.println("Введите второе число");
        int b = scan.nextInt();
        System.out.println("Введите 1 для сложения, 2 для вычитания:");
        int number = scan.nextInt();

        if (number == 1 || number == 2) {
            System.out.println("Ваш ответ:");
        }else if (number != 1 || number != 2){
            System.out.print("Вы ввели неверную операцию!");
        }

        switch (number) {
            case 1:
                System.out.println(a + b);
                break;

            case 2:
                System.out.println(a - b);
                break;
            default:
        }
        scan.close();
    }
}

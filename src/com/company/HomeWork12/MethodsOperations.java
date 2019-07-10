package com.company.HomeWork12;
//.4 Реализовать 4 метода на простейшие арифметические операции (+,-,*,/).
//Каждый метод должен принимать два вещественных числа и возвращать результат операции в виде вещественного числа.
//Добавьте меню, в котором пользователь может выбрать желаемую операцию.
import java.util.Scanner;
public class MethodsOperations {

    public static void main(String[] args) {

        int i = 1;
        int c = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число или цифру: ");
        double a = scan.nextDouble();
        System.out.print("Введите второе число или цифру: ");
        double b = scan.nextDouble();

        while (i > 0) {
            System.out.print("Введите 1 для сложения, 2 для вычитания, 3 для деления, 4 для умножения: ");
            c = scan.nextInt();
            if (c != 1 && c != 2 && c != 3 && c != 4){
                System.out.println("Вы ввели неверную операцию!");
            }else {
                break;
            }
            i++;
        }
        scan.close();



        addition(a, b, c);
        subtraction(a, b, c);
        division(a, b, c);
        multiplication(a, b, c);

    }
    static void addition(double a, double b, int c){

        if (c == 1){
            System.out.println(a+b);
        }

    }

    static void subtraction(double a, double b, int c){

        if (c == 2) {
            System.out.println(a - b);
        }

    }
    static void division(double a, double b, int c){

        if (c == 3) {
            System.out.println(a / b);
        }

    }
    static void multiplication(double a, double b, int c){

        if (c == 4) {
            System.out.println(a * b);
        }

    }
}

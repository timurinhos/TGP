package com.company.HomeWork13;
//2)Найти периметр фигуры по заданным сторонам AB, AD, и CD (см. рисунок)
//Определить метод для расчета гипотенузы прямоугольного треугольника по его катетам.
import java.util.Scanner;
public class MethodFigure {

    public static void main(String[] args) {

        double a = 0;
        double b = 0;
        double bd, p, g;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сторону AB");
        double ab = scan.nextInt();
        System.out.println("Введите сторону AD");
        double ad = scan.nextInt();
        System.out.println("Введите сторону CD");
        double cd = scan.nextInt();
        scan.close();

        g = Func(ab, ad);
        bd = Func(g, cd);
        p = ab + ad + cd + bd;

        Func(a, b);

        System.out.println("Периметр = " + p);
        System.out.println("Гипотенуза = " + g);

    }

    private static double Func (double a, double b){

    return Math.sqrt(a * a + b * b);
    }

}

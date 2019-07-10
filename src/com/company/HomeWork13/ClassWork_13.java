package com.company.HomeWork13;
import java.util.Scanner;
public class ClassWork_13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите основание первой трапеции:");
        int m = scan.nextInt();
        System.out.println("Введите основание первой трапеции:");
        int m1 = scan.nextInt();
        System.out.println("Введите высоту трапеций:");
        int h = scan.nextInt();
        System.out.println("Введите основание второй трапеции:");
        int m2 = scan.nextInt();
        System.out.println("Введите основание второй трапеции:");
        int m3 = scan.nextInt();
        System.out.println("Введите высоту трапеций:");
        int h1 = scan.nextInt();
        scan.close();
        Sum(m, m1, h, m2, m3, h1);
        Square(m, m1, h, m2, m3, h1);


    }

    static void Sum(int m, int m1, int h, int m2, int m3, int h1){
        double l1 = Math.sqrt(h*h + (m - m1) * (m - m1) / 4);
        double l2 = Math.sqrt(h1*h1 + (m2 - m3) * (m2 - m3) / 4);
        System.out.println("Сумма периметра первой трапеции: " + (m + m1 + 2 * l1));
        System.out.println("Сумма периметра второй трапеции: " + (m2 + m3 + 2 * l2));
    }
    static void Square(int m, int m1, int h, int m2, int m3, int h1){

        System.out.println("Сумма площади первой трапеции: " + ((m + m1) / 2 * h));
        System.out.println("Сумма площади второй трапеции: " + ((m2 + m3) / 2 * h1));
    }
}

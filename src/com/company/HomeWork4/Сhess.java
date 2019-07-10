package com.company.HomeWork4;


public class Сhess {

    public static void main(String[] args) {

        int a = 8;
        int b = 7;
        int c = 5;
        int d = 3;

        if (Math.abs(a - c) == 0 || Math.abs(b - d) == 0) {
            System.out.println("Ладья a и b угрожает фигуре с и d");
        }
        if (Math.abs(a-c) == Math.abs(b-d)) {
            System.out.println("Слон a и b угрожает фигуре с и d");
        }
        if (Math.abs(a-c) == 1 || Math.abs(b-d) == 1) {
            System.out.println("Король a и b угрожает фигуре с и d");
        }
        if (Math.abs(a-c) == Math.abs(b-d) || a == c || b == d) {
            System.out.println("Ферзь a и b угрожает фигуре с и d");
        } else {
            System.out.println("Ничто не угрожает фигуре");
        }
    }
}

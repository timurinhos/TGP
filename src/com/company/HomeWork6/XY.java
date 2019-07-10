package com.company.HomeWork6;
//Даны натуральный числа x и y. Вычислить произведение xy, используя лишь оператор сложения.

public class XY {

    public static void main(String[] args) {

        int x = 3;
        int y = 5;
        int sum = 0;

        for (int i = 0; i < y; i++) {
            sum = sum + x;
            if (sum == 15) {
                System.out.println("произведение 3 и 5 = " + sum);
            }
        }

    }
}

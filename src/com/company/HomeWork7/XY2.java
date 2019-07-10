package com.company.HomeWork7;
//Даны натуральные числа x и y. Вычислить произведение x y, используя лишь оператор сложения
public class XY2 {

    public static void main(String[] args) {

        int x = 3;
        int y = 5;
        int sum = 0;
        int i = 0;

        while (i < y) {
            sum = sum + x;
            if (sum == 15) {
                System.out.println("произведение 3 и 5 = " + sum);
            }
            i++;
        }
    }
}

package com.company.HomeWork4;
//3.Создаем три переменные  a, b, c записываем в них любые не равные между собой значения. Написать программу, которая переставит числа в переменных таким образом, чтобы при выводе их на экран последовательность a, b и c оказалась строго возрастающей.
public class ThreeVariables {
    public static void main(String[] args) {

        int a = 6;
        int b = 10;
        int c = 3;
        int x;

        if(a > b)
        { x = a; a = b; b = x;
        }
        if(b > c)
        { x = c; c = b; b = x;
        }
        if(a > b)
        { x = a;  a = b;  b = x;
        }

        System.out.println(a + " " + b + " " + c);
    }
}

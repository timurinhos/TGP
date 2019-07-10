package com.company.HomeWork12;
//1. Напишите метод, чтобы найти наименьшее число среди трех чисел.
//Например:
//Введите первый номер: 25
//Введите второй номер: 37
//Введите третий номер: 29
public class MethodMinN {

    public static void main(String[] args) {

        float a = 25;
        float b = 37;
        float c = 29;
        MinNumber(a, b, c);

    }
    static void MinNumber(float a, float b, float c){

        System.out.println(a +" "+ b +" "+ c);

        if (a < b && a < c){
            System.out.println("Наименьшее значение - " + a);
        }else if (b < a && b < c){
            System.out.println("Наименьшее значение - " + b);
        }else if (c < a && c < b){
            System.out.println("Наименьшее значение - " + c);
        }

    }
}

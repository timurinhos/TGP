package com.company.HomeWork2;

//Из трёхзначного числа x вычли его последнюю цифру. Когда результат разделили на 10, а к частному слева приписали последнюю цифру числа xб то получили 237. Найти число x и вывести на экран.
public class NumberX {

    public static void main(String[] args) {

        int x = 732;

        int f = x / 100;
        int s = x / 10 % 10;
        int t = s & 10;


        System.out.println(x);
        System.out.print(t);
        System.out.print(s);
        System.out.print(f);










    }
}

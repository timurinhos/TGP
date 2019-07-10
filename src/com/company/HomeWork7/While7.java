package com.company.HomeWork7;
//Используя цикл while необходимо вывести на экран следующую последовательность чисел:
//7 14 21 28 35 42 49 56 63 70 77 84 91 98.
public class While7 {

    public static void main(String[] args) {


        int a = 1;
        int i = 1;
        while (a < 98) {
            a = 7 * i;
            System.out.print(a +" ");
            ++i;
        }



    }

}

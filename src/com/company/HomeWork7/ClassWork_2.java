package com.company.HomeWork7;
//Напечатать таблицу умножения на 7:
//1 х 7 = 7
//...
//9 х 7 = 63
public class ClassWork_2 {

    public static void main(String[] args) {
        int result;
        int seven = 7;
        for (int i = 1; i < 10; i++ ) {
            result = i * 7;
            System.out.println(i + " x " + seven + " = " + result);
        }
    }
}

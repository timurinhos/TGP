package com.company.HomeWork7;
//Напечатать таблицу умножения на 9 в обратном порядке:
//9 х 9 = 81
//...
//1 х 9 = 9
public class ClassWork_3 {
    public static void main(String[] args) {

        int result;
        int night = 9;
        for (int i = 9; i > 0; i-- ) {
            result = i * 9;
            System.out.println(i + " x " + night + " = " + result);
        }
    }
}


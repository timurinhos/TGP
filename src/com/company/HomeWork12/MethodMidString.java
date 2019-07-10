package com.company.HomeWork12;
//2. Напишите метод для отображения среднего символа строки.
//Примечание: а) Если длина строки нечетна, будут два средних символа.
//б) Если длина строки равна, то будет один средний символ.
//Данные теста:
//Введите строку: Hello World!!!
public class MethodMidString {

    public static void main(String[] args) {

        String str = "Hello World!!!";
        int start = 6;
        int end = 8;
        MidString(str, start, end);

    }
    static void MidString(String str, int start, int end){

        System.out.println(str);

        char[] mid = new char[end - start];
        str.getChars(start, end, mid, 0);
        System.out.println("Средний символ в строке: " + new String(mid));


    }
}

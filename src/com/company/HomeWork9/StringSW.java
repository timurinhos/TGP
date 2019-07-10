package com.company.HomeWork9;
//1.Напишите программу Java, чтобы проверить, начинается ли заданная строка с содержимым другой строки.
public class StringSW {

    public static void main(String[] args) {

        String st = "Светофор";
        String st1 = "Свет";

        System.out.println(st);
        System.out.println(st1);

        if (st.startsWith(st1)) {
            System.out.println("Cтрока начинается с содержимым другой строки");
        }
        else System.out.println("Cтрока не начинается с содержимого другой строки");



    }
}

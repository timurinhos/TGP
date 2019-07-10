package com.company.HomeWork9;
//1.Напишите программу Java, чтобы получить символ в указанном индексе в строке.
public class StringIndex {

    public static void main(String[] args) {

        String str1 = "Hey-dude";

        System.out.println(str1);

        char firstl = str1.charAt(0);
        System.out.println(firstl);
        char first2 = str1.charAt(3);
        System.out.println(first2);
        char first3 = str1.charAt(7);
        System.out.println(first3);


        char[] chars = { 'c', 'a', 't' };
        String str = new String(chars);
        System.out.println(str);

    }
}

package com.company.HomeWork9;
//2.Напишите Java программу для создания массива символов, содержащего содержимое строки.
public class StringArray {

    public static void main(String[] args) {

        String st = "map";

        System.out.println(st);

        char ch [] = {'g','m','a','p','d'};

        String st2 = new String(ch);
     String st3 = new String(ch,1,3);
        System.out.println(st3);

        char[] chars = { 'm', 'a', 'p' };
        String str = new String(chars);
        System.out.println(str);

    }
}

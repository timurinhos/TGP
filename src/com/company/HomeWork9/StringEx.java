package com.company.HomeWork9;

import java.util.Arrays;
import java.util.Objects;

public class StringEx {
    public static void main(String[] args) {
        String str1 = "HELLO=)))))))))";
        String str2 = new String("Hello=)");

        //str1 = "qwerty";
        System.out.println(str1);

//     char[]ch = {'a','b','c','d'};
//     String str3 = new String(ch);
//     String str4 = new String(ch,1,2);
//        System.out.println(str4);
        //обращение к символу по индексу
        //char firstletter = str1.charAt(0);
        //System.out.println(firstletter);

//        System.out.println(str1==str2);
//        System.out.println(str1.equals(str2));
//
//        System.out.println(str1.charAt(str1.length() - 1));
//        System.out.println(str1.codePointAt(2));

        //String string = "Это не JavaScript!";
//        if(string.contains("привет")){
//            System.out.println("Это java");
//        }else {
//            System.out.println("Нет ничего");
        // }

        //str1.concat(string);
        //System.out.println(str1.concat(string));

//        String [] files = {"data.txt","data.html","data.java"};
//        for(String i: files){
//            if(i.endsWith(".java")){
//                System.out.println("Есть такой файл");
//            }
//        }

        //System.out.println(str1.compareTo(str2));
       // System.out.println(str1.compareToIgnoreCase(str2));

/*
        if(cat.compareTo("котенок")==0){
            System.out.println("Строки равны");
        }else {
            System.out.println("Строки не рвны"+cat.compareTo("котенок")); }
        String cat = "Котенок";

*/
//        char[] cr = new char[string.length() + 2];
////        cr[string.length()] = '!';
////        cr[string.length() + 1] = ')';
////        string.getChars(0, string.length(),cr, 0);
////        System.out.println(cr);


//        String file = "file.com.txt";
//        int start = file.indexOf('.');
//        System.out.println("start = " + start);
//        int second = file.indexOf('.', start + 1);
//        System.out.println("second = " + second);
//        System.out.println(file.indexOf('.', second + 1));
//
//        System.out.println("substring = " + file.substring(start + 1, second));
//
//        //split valueOf
        String text = "some:text;devided.by_some=characters";
        String[] arrStr = text.split("[;:._=]");
        System.out.println(Arrays.toString(arrStr));

        String five = String.valueOf(5);
        System.out.println(five);
        Integer in = Integer.valueOf("5");


    }
}

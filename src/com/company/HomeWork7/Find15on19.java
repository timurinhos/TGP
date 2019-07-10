package com.company.HomeWork7;
//Найти 15 первых натуральных чисел, делящихся нацело на 19 и находящихся в интервале, левая граница которого равна 100.
public class Find15on19 {

    public static void main(String[] args) {

        int i = 0;
        int c = 100;

        while (i < 15){
            if (c % 19 == 0){
                System.out.println(c +" ");
                i++;
            }
            c++;
        }


    }
}

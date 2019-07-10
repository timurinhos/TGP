package com.company.HomeWork24.classWorck;

public class Test1 {
    public static void main(String[] args) {
        int[] num = new int[4];


        try {
            System.out.println("До");
            num[4] = 10;
            System.out.println("После");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за пределы массива");
        }

        System.out.println("После catch");
    }
}

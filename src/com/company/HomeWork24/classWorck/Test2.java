package com.company.HomeWork24.classWorck;

public class Test2 {
    static void getException() {
        int[] num = new int[4];
        System.out.println("До");
        num[4] = 10;
        System.out.println("После");


    }
}
class Test2Run{
    public static void main(String[] args) {
        try {
            Test2.getException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за пределы массива");
        }
        System.out.println("После catch");
    }
}


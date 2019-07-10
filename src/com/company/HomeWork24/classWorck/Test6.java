package com.company.HomeWork24.classWorck;

public class Test6 {
    static void method(int a) {
        try {
            if (a == 1) {
                a = a / 0;
            }
            if (a == 2) {
                int[] arr = new int[a];
                arr[3] = 34;
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход");
        }
    }
}

class Test6Run {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 12 / a;
            System.out.println( " a= "+a);
            Test6.method(a);
        }catch (ArithmeticException e){
            System.out.println("/ на 0 нельзя");
        }finally {
            System.out.println("Я отработаю всегда))))");
        }
    }
}

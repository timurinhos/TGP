package com.company.HomeWork20;

public class VarArg1 {
    static void test(int... v) {
        System.out.println("Кол-во элементов = " + v.length);
        for (int i = 0; i < v.length; i++) {
            System.out.println("arg = " + i + " " + v[i]);
        }
        System.out.println();

    }

    static void test(boolean... b) {
        System.out.println("Кол-во элементов = " + b.length);
        for (int i = 0; i < b.length; i++) {
            System.out.println("arg = " + i + " " + b[i]);
        }
        System.out.println();

    }

    static void test(String s,int... v) {
        System.out.println("Кол-во элементов = " + v.length);
        for (int i = 0; i < v.length; i++) {
            System.out.println("arg = " + i + " " + v[i]);
        }
        System.out.println();

    }
}

class Main1{
    public static void main(String[] args) {
        VarArg1.test(1,2,3);
        VarArg1.test("Test", 1,3,5,7);
        VarArg1.test(true,false,true);
    }
}
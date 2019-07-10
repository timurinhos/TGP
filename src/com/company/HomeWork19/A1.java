package com.company.HomeWork19;

public class A1 {

    int a;

    public A1(int a) {
        this.a = a;
    }

    int m() {
        return this.a += 5; //  = 10
    }

    int m1() {
        return m() + 5;
    }
}
class Test3{

    public static void main(String[] args) {
        A1 a1 = new A1(5);

        System.out.println(a1.m1());
    }

}
package com.company.HomeWork17;

public class C {

    int s;

    public C(int s) {
        //B b = new B();
        B.s = s;
    }
}
class B{

    static int s;
}
class Run{
    public static void main(String[] args) {
        C c = new C(123);

        System.out.println(B.s);
        System.out.println(c.s);
    }
}
package com.company.HomeWork22.Generics;

public class Pair<T, V extends T> {

    T objectT;
    V objectV;

    public Pair(T objectT, V objectV) {
        this.objectT = objectT;
        this.objectV = objectV;
    }
}

//class A {
//
//    int a;
//
//    public A(int a) {
//        this.a = a;
//    }
//}
//
//class B extends A{
//
//    public B(int a) {
//        super(a);
//    }
//}
class Test3 {
    public static void main(String[] args) {

        Pair<Number, Integer> pair = new Pair<>(15, 15);
        //Pair<A,B>ab = new Pair<>(new A(15),new B(14));

        //Pair<Number, String> pair1 = new Pair<>(15, "Тest");
    }
}

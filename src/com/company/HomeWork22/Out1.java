package com.company.HomeWork22;

public class Out1 {
    int out = 10;

    void method() {
        for (int i = 0; i < 10; i++) {
                class Inner {
                    void inMethod() {
                        System.out.println("Поле внешнего класса = " + out);
                    }
                }
            Inner inner = new Inner();
            inner.inMethod();
        }
    }
}

class Test{
    public static void main(String[] args) {
        Out1 o = new Out1();
        o.method();
    }
}

package com.company.HomeWork18;

public class A {
    int i, j;

    public A() {
        System.out.println("Конструктор A");
    }

    void show() {
        System.out.println(i + " " + j);
    }
}

class B extends A {
    public B() {
        System.out.println("Конструктор B");
    }


//    int i;


    @Override
    void show() {
        System.out.println("Переопределенный метод");
    }

    public B(int a, int b) {
        super.i = a;
        this.i = b;
    }

//    void show() {
//        System.out.println("Родитель" + super.i);
//        System.out.println("Наследник" + this.i);
//    }
}

class C extends B {
    public C() {
        System.out.println("Конструктор C");
    }
}


class RunSuper {
    public static void main(String[] args) {
        A a1 = new A();
        a1.show();

        B b = new B(111, 222);
        A a = new B(12,12);

        b.show();

        System.out.println(a.i);
    }
}
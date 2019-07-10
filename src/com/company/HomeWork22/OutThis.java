package com.company.HomeWork22;

public class OutThis {

    int i;

    void method() {
        System.out.println("Метод внешнего класса");
    }

     class Inner {

        public OutThis outer() {
            return OutThis.this;
        }
//        void method() {
//            OutThis outThis = new OutThis();
//            outThis.method();
//        }

    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        OutThis outThis = new OutThis();
        //OutThis.Inner inner = outThis.inner();//создание объекта внутреннего класса
        OutThis.Inner inner = outThis.new Inner();

        inner.outer().method();

    }

}

package com.company.HomeWork17;

public class Methods1 {

    void method(byte b) {
        System.out.println("Байт");
    }

    void method(short s) {
        System.out.println("Шорт");
    }

    void method(int i) {
        System.out.println("Инт");
    }

    void method(float f) {
        System.out.println("Флот");
    }

    void method(double d){
        System.out.println("Дабл");
    }
}
class Runn1 {
    public static void main(String[] args) {
        Methods1 methods1 = new Methods1();

        int i = 10;
        double d = 12.6;
        byte b = 123;
        short s = 10;
        float f = 3f;

        methods1.method(s);
        methods1.method(d);
        methods1.method(i);
        methods1.method(f);
        methods1.method(b);
        methods1.method(s + s);

    }
}

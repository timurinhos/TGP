
package com.company.HomeWork17;

public class Methods {

    void method() {
        System.out.println("Нет параметров");
    }

    int method(int a, int b) {
        System.out.println("С двумя интовыми параметрами");
        return a + b;

    }

    double method(double a, double b) {

        System.out.println("C двумя дабл параметрами");
        return a + b;
    }
}

class Run1 {

    public static void main(String[] args) {

        Methods methods = new Methods();

        int res;
        double resd;


        methods.method();
        System.out.println();
        res = methods.method(4, 6);
        System.out.println();
        resd = methods.method(4.0, 6.0);

        System.out.println("Int" + res);
        System.out.println("Double" + resd);

    }

}



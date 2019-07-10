package com.company.HomeWork15;
//1)В примере с классом Circle выполнить:
//Создайте в классе Circle метод, вычисляющий длину окружности.
//Создайте в классе Circle метод, который будет перемещать центр окружности на заданное расстояние.
//Создайте в классе Circle метод, вычисляющий площадь той окружности, к которой метод применён.
public class Circle1 {


    double r;
    double st;
    double st1;
    double l;
    double s;
    double c;


    public Circle1(double r, double st, double st1){
        this.r = r;
        this.st = st;
        this.st1 = st1;

    }

    static final double Pi;

    static{
        Pi = 3.14;
    }


    public void length(){

        l = 2 *Pi * r;
        System.out.println("Длина окружности = " + l);
    }

    public void square(){

        s = Pi * r * r;
        System.out.println("Площадь окружности = " + s);
    }

    public void center(){

        c = (st + st1) / 2;
        System.out.println("Центр окружности = " + c);
    }

}

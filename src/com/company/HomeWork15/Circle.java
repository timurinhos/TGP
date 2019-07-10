package com.company.HomeWork15;

public class Circle {
    //свойства(поля) класса
    double x;
    double y;
    double r;

    static final double PI;

    static{
        PI = 3.14;
    }

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    //методы класа(поведение)
    public void print(){
        System.out.println("Окружность с такими координатами "
                + " x = " + x + " у = " + y + "   " +"радиус = "+r);
    }


    public void zoom(int k){
         r = r*k;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }
}

package com.company.HomeWork20;
//1)В рамках некоторой системы необходимо разработать набор классов для хранения информации о треугольниках на плоскости.
//Известно, что треугольник состоит из трех точек.
public class TriangleRun {

    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(4,6,10);
        Triangle triangle2 = new Triangle(5,8,13);
        Point point1 = new Point();

        System.out.println(point1.getDescription() + " 1");
        System.out.println(triangle1.getDescription());
        System.out.println("Периметр фигуры: " + triangle1.getPerimeter());
        System.out.println("Площадь фигуры: " + triangle1.getSquare());

        System.out.println(point1.getDescription() + " 2");
        System.out.println(triangle2.getDescription());
        System.out.println("Периметр фигуры: " + triangle2.getPerimeter());
        System.out.println("Площадь фигуры: " + triangle2.getSquare());

    }
}

class Point {

    String getDescription() {
        return "Треугольник";
    }

}

class Triangle extends Point {

    double a;
    double b;
    double ab;

    Triangle(double a, double b, double ab) {
        this.a = a;
        this.b = b;
        this.ab = ab;
    }

    double getSquare() {
        double square = (this.a * this.b * Math.sin(this.ab * Math.PI / 180))/2;
        return square;
    }

    double getPerimeter() {
        double c = Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2) - 2 * this.a * this.b * Math.cos(this.ab * Math.PI / 180));
        double perimeter = this.a + this.b + c;
        return perimeter;
    }

    String getDescription() {
        return "Треугольник со сторонами: " + this.a + ", " + this.b + " и углом между ними: " + this.ab;
    }
}
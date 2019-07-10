package com.company.HomeWork18;


public class Shape extends Object{
    double width;
    double height;

    public Shape() {
    }

    Shape(double width, double height) {
        this.width = width;
        this.height = height;
}

    Shape(double x) {
        this.width = this.height = x;
    }


    public Shape(int x) {
        this.width = this.height = x;
    }

    public Shape(Shape shape){
        width = shape.width;
        height = shape.height;
    }




    void show() {
        System.out.println(" Ширина " + width
                + "Высота " + height);

    }
}
//===========================================================
class Triangle extends Shape {

    public Triangle() {
        this.style = "НИКАКОЙ";
    }

    public Triangle(double x) {
        super(x);
        this.style = "Закрашений";
    }

    Triangle(double width, double height, String style) {
        super(width, height);
        this.style = style;
    }

    public Triangle(Triangle triangle) {
        super(triangle);
        this.style = triangle.style;
}

    String style;


    double area() {
        return width * height / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                ", style='" + style + '\'' +
                '}';
    }
}
//====================================================================

class TrinangleColor extends Triangle{

    String color;


    public TrinangleColor(double width, double height, String style, String color) {
        super(width, height, style);
        this.color = color;
    }

    void showColor(){
        System.out.println("Цвет" + color);
    }



}
//=============================================
class Rectangle extends Shape {


    public Rectangle(double width, double height) {
        super(width, height);
    }

    public Rectangle(double x) {
        super(x);
    }

    boolean isSquare() {
        if (width == height) {
            return true;
        } else {
            return false;
        }
    }

    double area() {
        return width * height;
    }
}

class Run {

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(45, 12, "прозрачный");
        Triangle triangle2 = new Triangle(12);
        Rectangle rectangle1 = new Rectangle(10,20);
        Rectangle rectangle2 = new Rectangle(15);
        TrinangleColor triangle3 = new TrinangleColor(32,55,"aaa","Желтый");

        Triangle triangle4 = new Triangle(triangle3);

        System.out.println(triangle4);
        //Shape shape = new Shape();




//        triangle1.height = 10;
//        triangle1.width = 5;
//        triangle1.style = "закрашеный";

//        triangle2.height = 15;
//        triangle2.width = 10;
//        triangle2.style = "контурный";

        triangle1.show();
        triangle1.showStyle();
        System.out.println(triangle1.area());


//        triangle2.show();
//        triangle2.showStyle();
//        System.out.println(triangle2.area());


    }


}
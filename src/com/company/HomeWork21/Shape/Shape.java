package com.company.HomeWork21.Shape;

abstract class Shape {

    private String name;
    private double length;
    private double width;
    private double height;

    Shape(double x, String name) {
        length = width = height = x;
        this.name = name;
    }

    Shape(double length, double width, double height, String name) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.name = name;
    }

    abstract double getVolume();

    abstract double getSquare();

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void showShape(int i) {
        System.out.println(getName() + " c длиной: " + getLength() + ", с шириной: " + getWidth() + ", с высотой: " + getHeight());
        System.out.println("Площадь " + i + " фигуры" + " = " + getSquare());
        System.out.println("Объем " + i + " фигуры "  + " = " + getVolume() + "\n");

    }
}

class Block extends Shape {

    Block(double length, double width, double height, String name) {

        super(length, width, height, name);
    }


    @Override
    double getVolume() {
        return getSquare() *super.getHeight();
    }

    @Override
    double getSquare() {
        return super.getLength() * super.getWidth();
    }

}

class Pyramid extends Shape {

    Pyramid(double length, double width, double height, String name) {
        super(length, width, height, name);
    }

    @Override
    double getVolume() {
        return (1 * getSquare() * super.getHeight()) / 3;
    }

    @Override
    double getSquare() {
        double p = (getLength() + getWidth() + getWidth())/2; double s = Math.sqrt(p*(p - getLength())*(p - getWidth())*(p - getWidth())); return 4 * s + Math.pow(getLength(), 2);
    }
}

class Sphere extends Shape {

    Sphere(double x, String name) {
        super(x, name);
    }

    @Override
    double getVolume() {
        return 4*3.14*Math.pow(getHeight(), 3) / 3;
    }

    @Override
    double getSquare() {
        return 4*3.14*Math.pow(getHeight(), 2);
    }
}

package com.company.HomeWork20;

public class Car {
    private double x;
    private double y;
    private double cource = 0;
    private Player player;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Car(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void forward(int distance) {
        x = x + distance * Math.cos(cource / 180 * Math.PI);
        y = y + distance * Math.sin(cource / 180 * Math.PI);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getCource() {
        return cource;
    }

    public void setCource(double cource) {
        this.cource = cource;
    }

    void printCoord() {
        System.out.println(x + "  " + y);
    }

    @Override
    public String toString() {
        return "Car{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

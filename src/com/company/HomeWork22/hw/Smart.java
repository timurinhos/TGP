package com.company.HomeWork22.hw;

public class Smart implements Mobile {
    static int id;
    String name;
    double price;



    public Smart() {
    }

    public Smart(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public void save() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void typeOfMobile() {

    }

    @Override
    public void getDeviceByName() {

    }

    @Override
    public String toString() {
        return "Smart{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

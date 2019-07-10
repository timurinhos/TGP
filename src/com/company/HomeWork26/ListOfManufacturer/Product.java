package com.company.HomeWork26.ListOfManufacturer;

public class Product implements Comparable<Product> {

    private String model;
    private int price;

    public Product(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() { return model; }
    public int getPrice() { return price; }

    @Override
    public String toString() {
        return "Модель: " + model + ", Цена: " + price + " ";
    }

    @Override
    public int compareTo(Product product) {
        return 0;
    }
}

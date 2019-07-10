package com.company.HomeWork24.Ishop;

public class Products {

    private String type;
    private double price;

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public double getPrice() { return price; }

    public void setPrice(double price) {
        if(price > 0){
        this.price = price;
        }else{
        System.out.println("Неверная цена!");
        }
    }
}

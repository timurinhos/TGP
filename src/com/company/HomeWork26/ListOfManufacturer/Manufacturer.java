package com.company.HomeWork26.ListOfManufacturer;

public class Manufacturer {

    private String name;

    public Manufacturer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " Производитель: " + name;
    }

}

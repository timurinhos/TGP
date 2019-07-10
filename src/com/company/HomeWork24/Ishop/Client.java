package com.company.HomeWork24.Ishop;

public class Client extends Order{

    private String name;
    private int id;

    public Client(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    void MadeOrder(Products products) {
        System.out.println("\nКлиент " + name + " сделал заказ, его id: " + id);
        System.out.println("Товар который заказал клиент: " + products.getType() + ", его цена: " + products.getPrice() + " грн");
    }

    @Override
    boolean PayOrder(int paid) {
        boolean isPaid = false;
        if (paid <= 1) {
            isPaid = true;
            System.out.println("Клиент " + name + " оплатил заказ!");
        }
        return isPaid;
    }

}

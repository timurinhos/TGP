package com.company.HomeWork24.Ishop;

public class Admin {

    public void AdminAdd(Products products, String type, double price) {
        System.out.print("Добавление товара:\n");
        products.setType(type);
        products.setPrice(price);
        System.out.print("Тип: " + products.getType());
        System.out.print(", Цена: " + products.getPrice() + " грн" + "\n");
    }

    public void BlackList(int payed) {
        if (payed > 1) {
            System.out.println("Клиент добавлен в черный список за неуплату товара!");
        } else {
            System.out.println("Продукт оплачен)");
        }
    }

}

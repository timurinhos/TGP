package com.company.HomeWork26.ListOfManufacturer;

import java.util.Comparator;

public class SortingProductsName implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        return product1.getModel().compareTo(product2.getModel());
    }
}

class SortingProductsPrice implements Comparator<Product>{

    @Override
    public int compare(Product product1, Product product2) {
        return product1.getPrice() - product2.getPrice();

    }
}

package com.company.HomeWork19;
//Создать интерфейсы: Товар <- Телефоны и планшеты <- Мобильные телефоны
//Класс Смартфоны должен реализовать указанные интерфейсы и содержать дополнительно 4-5 полей.
//На базе класса Смартфоны создать как минимум пять экземпляров класса.
public class Smart implements Product, Tablets, SmartPhones {

    private int id;
    private String type;
    private String name;
    private String model;

    public Smart(int id, String type, String name, String model) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.model = model;
    }

    @Override
    public String nameS() { return name; }
    @Override
    public String modelS() { return model; }
    @Override
    public String nameT() { return model; }
    @Override
    public String modelT() { return model; }
    @Override
    public int id() { return id; }
    @Override
    public String type() { return type; }

}

class SmartTest {

    public static void main(String[] args) {

        Product product1 = new Smart(1, "Cмартфон", "Apple", "Iphone 4S");
        Product product2 = new Smart(2, "Cмартфон", "Apple", "Iphone 7");
        Product product3 = new Smart(3, "Планшет", "Asus", "Zen-mate");
        Product product4 = new Smart(4, "Cмартфон", "Samsung", "Galaxy 9");
        Product product5 = new Smart(5, "Планшет", "Apple", "Air pad 3");

        System.out.println("id продукта: " + product1.id() + ", Тип: " + product1.type() + ", Производитель: " + ((Smart) product1).nameS() + ", Модель: " + ((Smart) product1).modelS());
        System.out.println("id продукта: " + product2.id() + ", Тип: " + product2.type() + ", Производитель: " + ((Smart) product2).nameS() + ", Модель: " + ((Smart) product2).modelS());
        System.out.println("id продукта: " + product3.id() + ", Тип: " + product3.type() + ", Производитель: " + ((Smart) product3).nameT() + ", Модель: " + ((Smart) product3).modelT());
        System.out.println("id продукта: " + product4.id() + ", Тип: " + product4.type() + ", Производитель: " + ((Smart) product4).nameS() + ", Модель: " + ((Smart) product4).modelS());
        System.out.println("id продукта: " + product5.id() + ", Тип: " + product5.type() + ", Производитель: " + ((Smart) product5).nameT() + ", Модель: " + ((Smart) product5).modelT());

    }
}
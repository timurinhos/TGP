package com.company.HomeWork24.Ishop;
//Система Интернет-магазин. Администратор добавляет информацию о Товаре. Клиент делает и оплачивает Заказ на Товары. Администратор регистрирует Продажу и может занести неплательщиков в «черный список».
//Задачу сделать, используя принципы ООП. Добавьте исключения
public class ShopTest {

    public static void main(String[] args) {

        Admin admin = new Admin();
        Products product1 = new Products();
        Products product2 = new Products();
        Products product3 = new Products();

        admin.AdminAdd(product1, "Asus ZenMate", 3500);
        admin.AdminAdd(product2, "Iphone 7", 13000);
        admin.AdminAdd(product3, "Zalman Z11", 1500);

        Client client1 = new Client("Алексей Маевский", 983);
        client1.MadeOrder(product3);
        int paid = (int) (Math.random() * 4);
        client1.PayOrder(paid);

        admin.BlackList(paid);

        Client client2 = new Client("Константин Аброскин", 333);
        client2.MadeOrder(product1);
        client2.PayOrder(paid);

        admin.BlackList(paid);

        Client client3 = new Client("Феликс Аксенов", 456);
        client3.MadeOrder(product2);
        client3.PayOrder(paid);

        admin.BlackList(paid);

    }
}

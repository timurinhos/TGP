package com.company.HomeWork6;
//Одна единица некоторого товара стоит 24,5 грн. Напечатать таблицу стоимости 2, 3 ... 20 штук этого товара.5.	Одна единица некоторого товара стоит 24,5 грн. Напечатать таблицу стоимости 2, 3 ... 20 штук этого товара
public class Price245 {

    public static void main(String[] args) {

        System.out.println("Название товара \t\t\t" + "количество \t\t\t" + "стоимость \t\t\t");

        float a = 24.5f;
        for (int i = 1; i <= 20; i++) {
            float sum = a * i;
            System.out.println("Диод \t\t\t\t\t\t\t" + i +"\t\t\t\t"+ sum + " грн");
        }
        System.out.println(" ");
    }

}

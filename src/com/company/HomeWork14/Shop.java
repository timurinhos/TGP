package com.company.HomeWork14;
//Написать программу, которая принимает стоимость покупок в магазине и выдает сумму к оплате с учетом следующей скидки:
//- 0 – 500: нет скидки
//- 501 – 1000: скидка 10%
//- 1001 – 2000: скидка 15%
// - 2001 и более: скидка 20%
import java.util.Scanner;
public class Shop {

    public static void main(String[] args) {

        int d = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сумму покупки: ");
        float sum = scan.nextFloat();
        scan.close();
        discount(sum, d);

    }

    static void discount(float sum, float d) {

        if (sum <= 500) {
            d = sum;
            System.out.println("Сумма к оплате с учетом скидки: " + d + " гривен");
        }
            if (sum > 500 && sum <= 1000) {
                d = sum * 0.90f;
                System.out.println("Сумма к оплате с учетом скидки: " + d + " гривен");
        }
            if (sum > 1000 && sum <= 2000) {
                    d = sum * 0.85f;
                    System.out.println("Сумма к оплате с учетом скидки: " + d + " гривен");
        }
            if (sum > 2000) {
            d = sum * 0.80f;
            System.out.println("Сумма к оплате с учетом скидки: " + d + " гривен");
        }
    }
}
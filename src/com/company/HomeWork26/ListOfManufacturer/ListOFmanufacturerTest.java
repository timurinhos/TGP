package com.company.HomeWork26.ListOfManufacturer;
//Создать консольное приложение
//Необходимо создать приложение, которое выводит список производителей.
//При выборе производителя выводятся все его товары.
//Производитель может иметь много товаров.
//Работу с пользователем организовать через консоль.
//Выполнить сортировку товаров по имени и цене.
import java.util.*;
public class ListOFmanufacturerTest {

    public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);

        Manufacturer manufacturer1 = new Manufacturer("HTC");
        Manufacturer manufacturer2 = new Manufacturer("Samsung");
        Manufacturer manufacturer3 = new Manufacturer("Apple");

        Comparator<Product> sorting = new SortingProductsName().thenComparing(new SortingProductsPrice());

        List<Product> products = new ArrayList<>();
        products.add(0, new Product("One x", 3000));
        products.add(1, new Product("Galaxy S9", 17500));
        products.add(2, new Product("Iphone 7", 13000));
        products.add(3, new Product("U11", 15000));
        products.add(4, new Product("A8", 14900));
        products.add(5, new Product("Iphone X", 19000));
        products.add(6, new Product("J7", 8999));
        products.add(7, new Product("Iphone 8 plus", 16300));
        products.add(8, new Product("Desire 12", 4399));
        products.sort(sorting);

        System.out.println("Полный список отсортированных товаров всех производителей:");
        for (int j = 0; j < products.size(); j++) {
            System.out.println(products.get(j));
        }

        System.out.println("\n" + manufacturer1);
        System.out.println(manufacturer2);
        System.out.println(manufacturer3);

        Map<Product, Manufacturer> htcP = new HashMap<>();
        htcP.put(products.get(8), manufacturer1);
        htcP.put(products.get(1), manufacturer1);
        htcP.put(products.get(7), manufacturer1);

        Map<Product, Manufacturer> samsungP = new HashMap<>();
        samsungP.put(products.get(0), manufacturer2);
        samsungP.put(products.get(2), manufacturer2);
        samsungP.put(products.get(6), manufacturer2);

        Map<Product, Manufacturer> appleP = new HashMap<>();
        appleP.put(products.get(4), manufacturer3);
        appleP.put(products.get(3), manufacturer3);
        appleP.put(products.get(5), manufacturer3);

        int i = 1;
        int choose = 0;
        while (i > 0) {

            System.out.print("\nВведите 1 что бы вывести все товары HTC, 2 - Samsung, 3 - Apple: ");
            choose = scan.nextInt();

            if (choose != 1 && choose !=2 && choose !=3){
                System.out.println("\nВы ввели неверную операцию!");
            }else {
                break;
            }
            i++;

        }

            switch (choose) {
                case 1: {
                    System.out.println("\nТовары производителя HTC:");

                    htcP.entrySet().stream()
                            .sorted(Map.Entry.<Product, Manufacturer>comparingByKey(sorting))
                            .forEach(System.out::println);

                    break;
                }
                case 2: {
                    System.out.println("\nТовары производителя Samsung:");

                    samsungP.entrySet().stream()
                            .sorted(Map.Entry.<Product, Manufacturer>comparingByKey(sorting))
                            .forEach(System.out::println);

                    break;
                }
                case 3: {
                    System.out.println("\nТовары производителя Apple:");

                    appleP.entrySet().stream()
                            .sorted(Map.Entry.<Product, Manufacturer>comparingByKey(sorting))
                            .forEach(System.out::println);

                    break;
                }
                default:
            }
    }
}

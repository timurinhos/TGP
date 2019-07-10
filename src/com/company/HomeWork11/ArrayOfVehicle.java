package com.company.HomeWork11;
//3)Создайте массив содержащий марки автомобилей, отсортируйте его сначала по возрастанию, потом по убыванию.
import java.util.Arrays;
public class ArrayOfVehicle {

    public static void main(String[] args) {

    String [] cars = {"toyota", "nissan", "opel", "mazda", "hammer", "dodge"};
    int i, j;

        for (i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }

        for (i = 0; i < cars.length - 1; i++) {
            if (cars[i].compareTo(cars[i + 1]) > i + 1) {
                String t = cars[i + 1];
                cars[i + 1] = cars[i];
                j = i;
                while (j > 0 && t.compareTo(cars[j - 1]) < j - 1) {
                    cars[j] = cars[j - 1];
                    j--;
                }
                cars[j] = t;
            }
        }

        System.out.println("\n" + Arrays.toString(cars));

        for (i = 0; i < cars.length - 1; i++) {
            if (cars[i].compareTo(cars[i + 1]) < i + 1) {
                String t = cars[i + 1];
                cars[i + 1] = cars[i];
                j = i;
                while (j > 0 && t.compareTo(cars[j - 1]) > j - 1) {
                    cars[j] = cars[j - 1];
                    j--;
                }
                cars[j] = t;
            }
        }

        System.out.println(Arrays.toString(cars));

    }
}

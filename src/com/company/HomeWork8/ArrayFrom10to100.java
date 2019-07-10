package com.company.HomeWork8;
//8.Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от 10 до 100. Вывести массив на экран. Вывести сумму всех элементов массива.
public class ArrayFrom10to100 {

    public static void main(String[] args) {

        int arr [] = {43, 54, 23, 65, 86, 27, 36, 12, 71, 26};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

        System.out.println("\n");

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            System.out.print(sum +" ");
        }
    }
}

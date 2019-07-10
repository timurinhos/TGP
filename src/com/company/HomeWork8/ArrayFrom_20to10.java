package com.company.HomeWork8;
//11.Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от -20 до 10. Вывести массив на экран. Вывести количество положительных чисел в массиве и их индексы (аналогично предыдущему примеру).
public class ArrayFrom_20to10 {

    public static void main(String[] args) {

        int arr [] = {-19, -7, 9, 5, -16, 4, 10, -5, -11, 8};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

        System.out.println("\n");

        int count = 0;
        int index;

        System.out.println("Индексы чисел в массиве: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0){
                count++;
                index = i;
                System.out.print(index +" ");
            }
        }
        System.out.println(" ");
        System.out.println("Количество положительных чисел:\n" + count);

    }

}

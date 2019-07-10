package com.company.HomeWork8;
//10.Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от -10 до 10. Вывести массив на экран. Вывести количество отрицательных чисел в массиве и их индексы.
public class ArrayFrom_10to10 {

    public static void main(String[] args) {

        int arr [] = {7, -3, 9, 6, -1, 4, 8, -5, -9, 10};

        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] +" ");
    }

        int count = 0;
        int index;

        System.out.println("\n");

        System.out.println("Индексы чисел в массиве: ");
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 0){
            count++;
            index = i;
            System.out.print(index +" ");
        }
    }
        System.out.println(" ");
        System.out.println("Количество отрицательных чисел:\n" + count);

}

}

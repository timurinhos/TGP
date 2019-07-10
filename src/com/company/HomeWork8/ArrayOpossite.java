package com.company.HomeWork8;
//7.Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от 0 до 10. Вывести на экран массив в обратном порядке.
public class ArrayOpossite {

    public static void main(String[] args) {

        int arr [] = {1, 3, 4, 6, 7, 2, 9, 10, 0, 8};

        for (int i = 9; i >= 0; i--) {

            System.out.print(arr[i] +" ");
        }

    }
}

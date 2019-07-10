package com.company.HomeWork8;
//Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от 0 до 10. Вывести массив на экран. Вывести сколько раз в массиве встречается число 5.
public class ArrayCount5 {

    public static void main(String[] args) {

        int arr [] = {7, 5, 9, 5, 1, 4, 5, 6, 3, 2};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

        System.out.println("\n");

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5){
                count++;
            }
        }
        System.out.print("В массиве число 5 встречается " + count + " раза");
    }
}

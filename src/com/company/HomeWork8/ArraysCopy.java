package com.company.HomeWork8;
//13.Создать массив на 10 элементов. Заполнить его случайными числами в диапазоне от 0 до 20. Создать копию первого массива. Вывести оба массива на экран. Увеличить все элементы второго массива в 2 раза. Вывести оба массива на экран. (Ожидаемый результат: только элементы второго массива должны быть изменены)
public class ArraysCopy {

    public static void main(String[] args) {

        int arr[] = {5, 17, 14, 7, 13, 20, 8, 4, 5, 11};
        int arr1[];
        arr1 = arr;

        System.out.print("Первый массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

        System.out.println("\n");

        System.out.print("Второй массив: ");
        for (int k = 0; k < arr1.length; k++) {
            System.out.print(arr1[k] +" ");
        }

        System.out.println("\n");

        System.out.print("Первый массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

        System.out.println("\n");

        System.out.print("Второй массив: ");
        for (int k = 0; k < arr1.length; k++) {
            System.out.print(arr1[k] * 2 +" ");
        }

    }
}

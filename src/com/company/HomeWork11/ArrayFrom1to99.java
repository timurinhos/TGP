package com.company.HomeWork11;
//2)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строка, а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).

import java.util.Arrays;
public class ArrayFrom1to99 {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99};
        int i, j;
        for (i = 0; i < arr.length; i++){
        }

        for (i = arr.length - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }

            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(" ");

        for (i = arr.length - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }

            }
        }
        System.out.println(Arrays.toString(arr));

    }
}


package com.company.HomeWork11;
//1)Создайте массив состоящий из 10 элементов используя класс Random, отсортируйте его с помощью сортировки пузырьком по убыванию.
import java.util.Random;
import java.util.Arrays;
public class BubbleOpposite {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[10];
        int i, j;
        for (i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
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

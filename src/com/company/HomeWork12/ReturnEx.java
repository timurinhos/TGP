package com.company.HomeWork12;

import java.util.Arrays;
import java.util.Random;

public class ReturnEx {
    public static void main(String[] args) {
        int count = 10, max = 100;
        int[] arr = createRandomArr(count, max);
        //System.out.println(Arrays.toString(arr));
        printAray(arr);
        int a = arrSum(arr);
        System.out.println("Сумма всех э-тов массива = " + a);

    }

    public static int[] createRandomArr(int coun, int max) {
        Random random = new Random();
        int[] array = new int[coun];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max);

        }
        return array;
    }

    public static int arrSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void printAray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");
        System.out.println("\b]");

    }


}

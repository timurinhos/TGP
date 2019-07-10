package com.company.HomeWork11;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        //int myArr[] = {21, 35, 1, 3, 99, 65, 5, 33, 7, 8, 12};
        Random random = new Random();
        int[] myArr = new int[1_000_00];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(100);
        }
        //System.out.println(Arrays.toString(myArr));

        long start = System.nanoTime();
        for (int i = myArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (myArr[j] > myArr[j + 1]) {
                    int tmp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = tmp;
                }

            }
        }
        long stop = System.nanoTime();
        //System.out.println(Arrays.toString(myArr));
        System.out.println(stop - start);
    }
}

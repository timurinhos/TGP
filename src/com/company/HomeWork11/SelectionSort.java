package com.company.HomeWork11;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        //int myArr[] = {21, 35, 1, 3, 99, 65, 5, 33, 7, 8, 12};

        Random random = new Random();
        int[] myArr = new int[1_000_00];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(100);
        }
        //System.out.println(Arrays.toString(myArr));

        long start = System.nanoTime();
        for (int i = 0; i < myArr.length; i++) {
            int min = myArr[i];
            int imin = i;
            for (int j = i + 1; j < myArr.length; j++) {
            //находим индекс минимального числа
                if (myArr[j] < min) {
                    min = myArr[j];
                    imin = j;
                }

            }
            //
            if (i != imin) {
                int temp = myArr[i];
                myArr[i] = myArr[imin];
                myArr[imin] = temp;
            }
            //System.out.print(myArr[i] + ", ");


        }
        long stop = System.nanoTime();
        System.out.println(stop-start);

    }
}

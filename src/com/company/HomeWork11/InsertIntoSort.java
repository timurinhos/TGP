package com.company.HomeWork11;

import java.util.Arrays;
import java.util.Random;

public class InsertIntoSort {
    public static void main(String[] args) {
        //nt myArr[] = {21, 35, 1, 3, 99, 65, 5, 33, 7, 8, 12};
        Random random = new Random();
        int[] myArr = new int[1_000_00];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(100);
        }
        int tmp, j;
        long start = System.nanoTime();
        for (int i = 0; i < myArr.length - 1; i++) {
            if (myArr[i] > myArr[i + 1]) {
                tmp = myArr[i + 1];
                myArr[i + 1] = myArr[i];
                j = i;
                while (j > 0 && tmp < myArr[j - 1]) {
                    myArr[j] = myArr[j - 1];
                    j--;
                }
                myArr[j] = tmp;
            }
        }
        //System.out.println(Arrays.toString(myArr));
        long stop = System.nanoTime();
        System.out.println(stop - start);


    }
}

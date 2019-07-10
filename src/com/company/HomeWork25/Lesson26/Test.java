package com.company.HomeWork25.Lesson26;

import java.util.Arrays;


public class Test {

    static int[] arr = new int[5];
    static int fully = 0;

    public static void main(String args[]) {
        for (int i = 0; i < 20; i++) {
            add(i);
        }
        System.out.println("fully:" + fully);
        System.out.println("length:" + arr.length);
        System.out.println("arr:" + Arrays.toString(arr));
    }


    static void add(int value) {
        if (fully + 1 == arr.length) {
            int[] temp = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[fully] = value;
        fully++;
    }
}


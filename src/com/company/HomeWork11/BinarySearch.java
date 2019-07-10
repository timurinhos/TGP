package com.company.HomeWork11;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int myArr[] = {21, 35, 1, 3, 99, 65, 5, 33, 7, 8, 12};
        System.out.println(Arrays.toString(myArr));

        Arrays.sort(myArr);
        System.out.println(Arrays.toString(myArr));

        int first = 0;
        int last = myArr.length;
        int num = 12;


        int pos;
        pos = (first + last) / 2;

        while ((myArr[pos] != num) && (first <= last)) {
            if (myArr[pos] > num) {
                last = pos - 1;
            } else {
                first = pos + 1;
            }
            pos = (first + last) / 2;
        }
        if ((myArr[pos] == num) && (first <= last)) {
            System.out.println(num + " является " + pos + " эл-том в массиве");
        } else {
            System.out.println("наш элемент не найден");
        }


    }
}

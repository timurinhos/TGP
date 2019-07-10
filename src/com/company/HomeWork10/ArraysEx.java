package com.company.HomeWork10;

import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args) {
        //int arr0[] = {1,2,3,4,6};
        int arr1[] = {1,2,3,4,5};
        int [][]arr2= {{1,2,3},{4,5}};
        //Arrays.fill(arr1,100);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.deepToString(arr2));

        //копирование массивов 1 способ
        int [] copy = new int[arr1.length];
        System.arraycopy(arr1, 0,copy,0,arr1.length);
        System.out.println(Arrays.toString(copy));

        //копирование массивов 2 способ
        int [] copy2 = Arrays.copyOfRange(arr1, 0, arr1.length);
        System.out.println(Arrays.toString(copy2));

        //сортировка
        int[] arr = {2,1,5,3,4};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //сравнение
        System.out.println(Arrays.equals(arr,arr1));

        //поиск бинарный
        int idx = Arrays.binarySearch(arr, 5);
        System.out.println(idx);


    }
}

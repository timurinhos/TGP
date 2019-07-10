package com.company.Lesson8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrEx {
    public static void main(String[] args) {


        int arr[];
        arr = new int[3];
        //int arr[] = new int[10];

        int arr1[] = new int[10];

       // arr = new int[5];

//        int arr2[] = {20, 30, 40};
//        arr2 = arr1;

       int arrr[] = new int[10];
        int i;
        //Инициализируем массив с помощью цикла for
        for (i = 0; i < 10; i++) {
            arrr[i] = i;
        }
        //вывод массива в консоль
        for (i = 0; i < 10; i++) {
            System.out.println("Элемент [" + i + "]" + arrr[i]);
        }

//        //int nums[] = new int[5];
//        int nums[] = {15, 15965, -465, 20, -54};
//        int min, max;
////        nums[0] = 15;
////        nums[1] = 15967;
////        nums[2] = -465;
////        nums[3] = 20;
////        nums[4] = -54;
//
//        min = max = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] < min) {
//                min = nums[i];
//            }
//            if (nums[i] > max) {
//                max = nums[i];
//            }
//        }
//      System.out.println("min = " + min + "\nmax = " + max);
//

//        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
//        double res = 0;
//        for (int i = 0; i < nums.length; i++) {
//            res += nums[i];
//        }
//        System.out.println("Средний эл-т = " + res / nums.length);
//    }

//        //выход за пределы массива
//        int arr[] = new int[10];
//        int i;
//        for (i = 0; i<10; i++) {
//            arr[i] = i;
//        }
//
//        System.out.print(i + " ");
//
    }


}


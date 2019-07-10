package com.company.HomeWork25.Lesson26;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedkistEx {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;

        }

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(arr));
        System.out.println("Начальный празмер коллекции " + linkedList.size());
        System.out.println(linkedList);
        linkedList.remove(5);
        //linkedList.remove(6);
        linkedList.add(5, 1000);
        for (int i = 0; i < 20; i++) {
            linkedList.add(i);
        }
        System.out.println(linkedList);
        System.out.println("Начальный празмер коллекции " + linkedList.size());
//        linkedList.add(10);
//        linkedList.add(12);
//        linkedList.add(13);
//        linkedList.add(14);
//        linkedList.add(16);
//        linkedList.add(17);
//        System.out.println("Начальный празмер коллекции " + linkedList.size());
//        Integer[] intArr = new Integer[linkedList.size()];
//        linkedList.toArray(intArr);
//        int sum = 0;
//        for (int i : intArr)
//            sum += i;
//        System.out.println("Сумма " + sum);

    }
}

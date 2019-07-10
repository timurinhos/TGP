package com.company.HomeWork8;
//3.Создать массив целых чисел на 4 элемента. Заполнить его значениями от 10 до 20. Поменять местами первый и последний элемент, а так же второй и третий.
public class ClassWork_8_3 {

    public static void main(String[] args) {

        int arr[] = {10,13,15,19};
        int i;
        int k;
        for (k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }

        System.out.println(" ");

        int fn = arr[arr.length - 1];
        int fn1 = arr[arr.length - 2];
        int fn2 = arr[arr.length - 3];
        int fn3 = arr[arr.length - 4];

        arr[0] = fn;
        arr[3] = fn3;
        arr[1] = fn1;
        arr[2] = fn2;
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

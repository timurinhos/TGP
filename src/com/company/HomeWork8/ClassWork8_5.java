package com.company.HomeWork8;
//5.Дан массив:
//a.Все его элементы увеличить в два раза.
//b.Умножить все элементы на последний элемент.
public class ClassWork8_5 {

    public static void main(String[] args) {

    int arr[] = {1,6,3,4,53,23};

    for (int i = 0; i < arr.length; i++){
        System.out.print(arr[i] +" ");
    }
        System.out.println("\n");

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + 2 +" ");
        }

        System.out.println("\n");

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] * arr[5] +" ");
        }
}
}

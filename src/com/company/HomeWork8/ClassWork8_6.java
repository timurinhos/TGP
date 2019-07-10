package com.company.HomeWork8;
//6.Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от 0 до 10. Вывести массив на экран. Найти наибольшее значение и его индекс.
public class ClassWork8_6 {
    public static void main(String[] args) {

        int arr[] = {5,3,6,7,9,10,2,4,8,1};
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println("\n");

        int maxvalue = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > maxvalue) {
                maxvalue = arr[i];
                index = i;

            }
        }
        System.out.println("Максимальное значение: " + maxvalue +" ");
        System.out.println("Индекс найбольшего занчения: " + index +" ");
    }
}

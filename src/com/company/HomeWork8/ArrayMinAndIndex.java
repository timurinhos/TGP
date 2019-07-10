package com.company.HomeWork8;
//9.Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от -10 до 10. Вывести массив на экран. Найти наименьшее значение и его индекс.
public class ArrayMinAndIndex {

        public static void main(String[] args) {

            int arr [] = {7, -3, 9, 6, -1, 4, 8, -5, -9, 10};

            int minvalue = arr[0];
            int index = 0;

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] +" ");
            }

            System.out.println("\n");

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < minvalue){
                    minvalue = arr[i];
                    index = i;
                }
            }
            System.out.println("Минимальное значение: " + minvalue +" ");
            System.out.println("Индекс минимального занчения: " + index +" ");
        }
}

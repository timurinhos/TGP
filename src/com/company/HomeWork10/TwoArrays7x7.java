package com.company.HomeWork10;
//Заполнить двумерный массив размерностью 7х7 следующим образом:
//
//а)
//1	0	0	0	0	0	1
//0	1	0	0	0	1	0
//0	0	1	0	1	0	0
//0	0	0	1	0	0	0
//0	0	1	0	1	0	0
//0	1	0	0	0	1	0
//1	0	0	0	0	0	1
//
//
//б)
//1	0	0	0	0	0	1
//0	1	0	0	0	1	0
//0	0	1	0	1	0	0
//1	1	1	1	1	1	1
//0	0	1	0	1	0	0
//0	1	0	0	0	1	0
//1	0	0	0	0	0	1
public class TwoArrays7x7 {

    public static void main(String[] args) {

        int [][] arr = new int[7][7];
        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if ((i == j) || (i == arr.length - 1 - j)) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" ");

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if ((i == j) || (i == arr.length - 1 - j) || (i == (arr.length) / 2)) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

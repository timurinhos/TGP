package com.company.HomeWork10;
//Заполнить массив размером 6 х 6 следующим образом
//1	1	1	1	1	1
//1	2	3	4	5	6
//1	3	6	10	15	21
//1	4	10	20	35	56
//1	5	15	35	70	126
//1	6	21	56	126	252
public class TwoArrays6x6 {
    public static void main(String[] args) {

        int [][] arrs = new int[6][6];
        int i, j;

        for (i = 0; i < arrs.length; i++) {
            for (j = 0; j < arrs.length; j++) {
                if (i == 0 || j == 0){
                    arrs[i][j] = 1;
                }else {
                    arrs[i][j] = arrs[i][j - 1] + arrs[i - 1][j] ;
                }
            }
        }
        for (i = 0; i < arrs.length; i++) {
            for (j = 0; j < arrs.length; j++){
                System.out.print(arrs[i][j] + " ");
            }
            System.out.println();
        }
    }
}

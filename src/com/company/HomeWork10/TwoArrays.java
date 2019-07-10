package com.company.HomeWork10;
/*1)Дан двумерный массив. Поменять местами:
  а) Элементы, расположенные в верхнем правом и нижним левым местах.
  б) Элементы, расположенные в нижнем правом и верхним левым углах.
*/
import java.util.Random;
public class TwoArrays {

    public static void main(String[] args) {

        Random ran = new Random();
        int [][] arrdoub = new int[3][4];
        int i, j;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                arrdoub[i][j] = ran.nextInt(9);
                System.out.print(arrdoub[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" ");

        int t;
        t = arrdoub[0][arrdoub[0].length - 1];
        arrdoub[0][arrdoub[0].length - 1] = arrdoub[arrdoub.length - 1][0];
        arrdoub[arrdoub.length - 1][0] = t;
        t = arrdoub[arrdoub.length - 1][arrdoub[arrdoub.length - 1].length - 1];
        arrdoub[arrdoub.length - 1][arrdoub[arrdoub.length - 1].length - 1] = arrdoub[0][0];
        arrdoub[0][0] = t;
        for (i = 0; i < arrdoub.length; i++) {
            for (j = 0; j < arrdoub[i].length; j++) {
                System.out.print(arrdoub[i][j] + " ");
            }
            System.out.println();
        }
    }
}


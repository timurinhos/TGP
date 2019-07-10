package com.company.HomeWork10;
//2)Дан двумерный массив, определить:
//а) какой элемент массива меньше: в нижнем правом углу или в нижнем левом.
//б) какой элемент массива больше: в верхнем правом или в верхнем левом углу.
import java.util.Random;
public class TwoArrays2 {

    public static void main(String[] args) {

        Random ran = new Random();
        int [][] arr = new int[3][4];
        int i, j;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                arr[i][j] = ran.nextInt(9);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        if (arr[arr.length - 1][0] > arr[arr.length - 1][arr[arr.length-1].length - 1]) {
            System.out.println("В левом нижнем углу больше, чем в нижнем правом");
        }
        else if (arr[arr.length - 1][0] == arr[arr.length - 1][arr[arr.length-1].length - 1]) {
            System.out.println("В правом нижнем углу и нижнем левом углу равны");
        }
        else {
            System.out.println("В нижнем левом углу меньше, чем в нижнем правом");
        }


        if (arr[0][0] > arr[0][arr[0].length - 1]) {
            System.out.println("В нижнем левом углу больше, чем в верхнем правом");
        }
        else if (arr[0][0] == arr[0][arr[0].length - 1]) {
            System.out.println("В верхнем правом углу и в верхнем левом углу равны");
        }
        else {
            System.out.println("В верхнем левом углу меньше, чем верхнем правом");
        }
    }
}

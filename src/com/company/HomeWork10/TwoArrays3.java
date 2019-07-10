package com.company.HomeWork10;
//3)Дан двумерный массив целых чисел. Выяснить:
//а)имеются ли нечетные числа в верхнем правом или в нижнем правом углу.
//б)имеются ли числа, оканчивающиеся цифрой 5, в верхнем левом или нижнем левом углу.
import java.util.Random;
public class TwoArrays3 {

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

        System.out.println(" ");
        if (arr[arr.length - 1][0] == 5) {
            System.out.println("В левом нижнем углу есть число оканчивающиеся цифрой 5");
        } else if (arr[arr.length - 3][0] == 5) {
            System.out.println("В левом верхнем углу есть число оканчивающиеся цифрой 5");
        } else {
            System.out.println("В левом верхнем углу и в левом нижнем углу нет чисел оканчивающиеся цифрой 5");
        }

        if (arr[arr.length - 1][arr[arr.length-1].length - 1] % 2 != 0) {
            System.out.println("В правом нижнем углу есть нечетное число");
        } else if (arr[0][arr[0].length - 1] % 2 != 0) {
            System.out.println("В правом верхнем углу есть нечетное число");
        } else {
            System.out.println("В правом нижнем углу и в правом верхнем углу цифры четные");
        }



    }
}

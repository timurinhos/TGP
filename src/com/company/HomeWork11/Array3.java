package com.company.HomeWork11;
//4)Программа просит пользователя заполнить массив, все элемент кратные трем, заменить на три используя линейный поиск.
import java.util.Scanner;
import java.util.Arrays;
public class Array3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Заполните массив:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();
        scan.close();

        int [] arr = {a,b,c,d,e,f};
        int i;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                arr[i] = 3;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

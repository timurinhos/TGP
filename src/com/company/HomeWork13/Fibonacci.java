package com.company.itstep.ua.Lesson13;

public class Fibonacci {

    public static void main(String[] args) {
        //System.out.println(fib(1));
        //fib(10);
        fibRec(5);
    }

    private static void fib(int arg) {
        int[] arr = new int[arg + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
            System.out.print(arr[i] + " ");
        }
    }

    public static int fibRec(int arg){
        System.out.print(" " + arg);
        if(arg==0){
            return 0;
        }else if (arg==1){
            return 1;
        }else {
            return fibRec(arg-1) + fibRec(arg-2);
        }


    }
}

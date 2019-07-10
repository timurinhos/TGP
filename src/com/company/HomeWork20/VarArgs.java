package com.company.HomeWork20;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {


    static void test(String s, double...v){
        System.out.println("Кол-во элементов = " + v.length);
//        for (int i = 0; i<v.length; i++){
////            System.out.println("arg = " + i +" " + v[i]);
////        }

        for (double d : v){
            System.out.println("arg = "+ d);
        }
        System.out.println();

    }

}

class Main{
    public static void main(String[] args) {


        int arr[] = new int[10];
//        for (int i = 0; i < arr.length; i++) {
////            arr[i] += i+1;
////        }

        VarArgs.test(" ",1);
        VarArgs.test("String",2,3,4,5,6,7);
        //VarArgs.test(arr);
        VarArgs.test(" ");
    }
}
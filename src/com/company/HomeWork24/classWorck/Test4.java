package com.company.HomeWork24.classWorck;

public class Test4 {

    public static void main(String[] args) {
        try {
            //int a = 0;
            int a = 1;
            System.out.println("a = " + a);
            int b = 51 / a;
            int[] arr = new int[1];
            arr[2] = 12;
        }catch (ArithmeticException e){
            System.out.println("/0 нельзя!!!");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Выход за массив");
        }
        System.out.println("После выполнения try catch");
    }
}

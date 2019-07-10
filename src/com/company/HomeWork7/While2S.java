package com.company.HomeWork7;
//Используя цикл while необходимо вывести на экран следующую последовательность чисел:
//1 2 4 8 16 32 64 128 256 512
public class While2S {

    public static void main(String[] args) {


        int e;
        int result;

        for (int i = 0; i < 10; i++) {
            result = 1;
            e = i;
            while (e > 0) {
                result *= 2;
                e--;
            }
            System.out.print(result +" ");
        }
        }
    }

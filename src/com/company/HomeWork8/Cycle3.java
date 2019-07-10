package com.company.HomeWork8;

public class Cycle3 {

    public static void main(String[] args) {


        for (int i = 0; i <= 4; i++) {

            for (int j = 0; j < 4-i; j++) {
                System.out.print(i + "\t");
            }
            System.out.print(i + "\n");
        }

        System.out.println(" ");

        for (int k = 6; k >= 2; k--) {

            for (int p = 0; p < 6-k; p++) {
                System.out.print(k + "\t");
            }

            System.out.println(k + "\n");
        }


    }

}

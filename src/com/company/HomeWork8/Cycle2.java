package com.company.HomeWork8;

public class Cycle2 {

    public static void main(String[] args) {


        for (int i = 0; i <= 4; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" 5 ");
            }
            System.out.print(" 5 \n");
        }

        System.out.println(" ");

        for (int k = 0; k <= 4; k++) {

            for (int p = 0; p < 4-k; p++) {
                System.out.print(" 1 ");
            }

            System.out.println(" 1 ");
        }


    }

}

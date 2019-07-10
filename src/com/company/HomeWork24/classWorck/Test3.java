package com.company.HomeWork24.classWorck;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {


        int a = 0, b, c;
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            try {
                b = random.nextInt();
                c = random.nextInt();
                a = 1234 / (b / c);
            }catch (ArithmeticException e){
                System.out.print("Делить на ноль нельзя!!!");

            }
            System.out.println("a =  " + a + " i = " + (i + 1));
        }
    }
}


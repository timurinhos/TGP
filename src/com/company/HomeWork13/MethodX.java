package com.company.HomeWork13;
//1)Рассчитать значение x, определив и использовав необходимый метод:
public class MethodX {

    public static void main(String[] args) {


        System.out.println(expression1());
        System.out.println(expression2());
        System.out.println(expression3());
        System.out.println(expression4());

    }

    private static double expression1(){

        double x = ((Math.sqrt(6) + 6) / 2) + ((Math.sqrt(13) + 13) / 2) + ((Math.sqrt(21) + 21) / 2);

        return x;
    }

    private static double expression2(){

        double x1 = ((Math.sqrt(5) + 5) / (Math.sqrt(7) + 7)) + ((Math.sqrt(12) + 12) / (Math.sqrt(8) + 8)) + ((Math.sqrt(31) + 31) / (Math.sqrt(2) + 2));

        return x1;
    }

    private static double expression3(){

        double x2 = ((Math.sqrt(8) + 15) / (Math.sqrt(15) + 8)) + ((Math.sqrt(12) + 6) / (Math.sqrt(6) + 12)) + ((Math.sqrt(21) + 7) / (Math.sqrt(7) + 21));

        return x2;
    }

    private static double expression4(){

        double x3 = ((Math.sqrt(7) + 13) / (Math.sqrt(13) + 7)) + ((Math.sqrt(12) + 15) / (Math.sqrt(15) + 12)) + ((Math.sqrt(21) + 32) / (Math.sqrt(32) + 21));

        return x3;
    }

}

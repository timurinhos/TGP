package com.company.HomeWork22.Boxing;

public class BoxingNum extends Object{
    public static void main(String[] args) {
        Integer in = 12;//Boxing
        in += 5;//Boxing
        int a = in;//Unboxing


        System.out.println("NumberGen = " + in);
        System.out.println("Type = " + in.getClass().getName());
        //System.out.println("Type = " + a.getClass().getName());

    }
}

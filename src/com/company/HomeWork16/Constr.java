package com.company.HomeWork16;


import java.util.Scanner;

public class Constr {
    int name;

    public Constr() {
        this(18);
    }
    //    public int Constr() {
//        int a = 0;
//        return a;
//    }

    public Constr(int name) {

        System.out.println(name);
    }


    public Constr(String name) {
//        if(name==""){
////            this(18);
////        }

        //System.out.println("Hello World");
        //System.out.println(name);
    }

    public static void main(String[] args) {
//        Constr c = new Constr(123);
//        System.out.println(c);

//        String name = "A";
//        new Constr("B");
        int a = 0;
        new Constr(a);



    }
}

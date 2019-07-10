package com.company.itstep.ua.Lesson13;

public class Recursion {
    public static void main(String[] args) {
//    a();
//
//    }
//
//    private static void a() {
//        System.out.println();
//        b();
//        System.out.println();
//    }
//
//    private static void b() {
//        System.out.println();
//        c();
//        System.out.println();
//    }
//
//    private static void c() {
//        System.out.println();
//        d();
//        System.out.println();
//    }
//
//    private static void d() {
//        System.out.println();
//        return;
//    }
//}
        rec(1);
    }

    public static void rec(int arg) {
        System.out.print(" " + arg);
        if (arg < 10) {
            rec(arg + 1);
        }
        System.out.print(" " + arg);
    }
}




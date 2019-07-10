package com.company.HomeWork19;

public abstract class AbstractEx {

    int i;
    double d;


   void show(){
       System.out.println();
   }

    abstract void method();

}
//============================================
abstract class ExtAbstr extends AbstractEx{


    @Override
    void method() {
        System.out.println("Метод method");
    }



    abstract void  method1();
}


//============================================

//class C extends AbstractEx

class Test1{
    public static void main(String[] args) {
        AbstractEx abstractEx;


    }
}
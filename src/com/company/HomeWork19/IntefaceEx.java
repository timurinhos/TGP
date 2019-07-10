package com.company.HomeWork19;

public interface IntefaceEx {

    int abc = 15;//static final

    //default
    void method();
}

interface Inter2 extends IntefaceEx{
    void method();


//    нужно объявить реализующий класс как abstract
//    void method1();
}


class A {
    void methodA(){

    }
}

class B extends A {


}

class C extends B {

}

//abstract
class D extends C implements  Inter2, IntefaceEx {
    @Override
    public void method() {

    }

    void doYouSeeMee(){
        System.out.println("I see you");
    }


//    @Override
//    public void method() {
//
//    }


}

class Test2 {
    public static void main(String[] args) {
        IntefaceEx inteface = new D();
        inteface.method();
        //inteface.doYouSeeMee();



//        D d = new D();
//        d.method();
    }
}
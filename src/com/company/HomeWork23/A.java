package com.company.HomeWork23;

public class A extends D{
}

class B extends A {

}

class C extends A {

}

class D {

}

class Gen<T> {
    T object;

    public Gen(T object) {
        this.object = object;
    }
}


class Run {
    static void test(Gen<? super A> object){

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A>aGen = new Gen<>(a);
        Gen<B>bGen = new Gen<>(b);
        Gen<C>cGen = new Gen<>(c);

        Gen<D>dGen = new Gen<>(d);

//        test(aGen);
//        test(bGen);
//        test(cGen);
//        test(dGen);

    }
}
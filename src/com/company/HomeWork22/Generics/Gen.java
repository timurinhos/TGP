package com.company.HomeWork22.Generics;

public class Gen<T> {

    T object;

    public Gen(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    void show(T object) {
        System.out.println("Тип объекта = " +
                object.getClass().getName());
    }

}

class Test {
    public static void main(String[] args) {
        Gen<Integer> genInt = new Gen<>(15);
        Gen<Double> genDob = new Gen<>(15.0);
        Gen<String> genStr = new Gen<>(" ");
//        genInt.show();
//        genStr.show();
//        genDob.show();
        //genInt.show(genStr);

        int value = genInt.getObject();//Unboxing
        System.out.println("Значение = " + value);

        //genInt=genDob; Error


    }
}

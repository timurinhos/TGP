package com.company.HomeWork23.ierarhija;

public class Gen<T> {

     T object1;



    public Gen(T object) {
//        this.object1 = new T();//недопустимо
        this.object1 = object;
    }

   public T getObject1() {
        System.out.println("метод из класса Gen");
        return object1;
    }
}


class GenExt<T, V> extends Gen<T> {

    V object2;
    T object3;

//    public void set(V object2) {//Ошибка неоднозначности
//        this.object2 = object2;
//    }
//
//    public void set(T object3) {
//        this.object3 = object3;
//    }

    public GenExt(T object, V object2) {
        super(object);
        this.object2 = object2;
    }

    @Override
    public T getObject1() {
        System.out.println("метод из класса GenExt");
        return super.getObject1();

    }
    //    public V getObject2() {
//        return this.object2;
//    }
}

class Test3 {

    public static void main(String[] args) {
        Gen<Integer> gen = new Gen<>(10);
        GenExt<String, Integer> genExt = new GenExt<>("Test", 23);
        System.out.println(gen.getObject1());
        System.out.println(genExt.getObject1());

    }
}
package com.company.HomeWork23.inter;

public interface Contain<T> {

    boolean contains(T object);
}

class MyClass<T> implements Contain<T> {

    T[] arr;

    public MyClass(T[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean contains(T object) {
        for (T o : arr) {
            if (o.equals(object)) {
                return true;
            }
        }
        return false;
    }
}

class Test2 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 4};

        MyClass<Integer> myClass = new MyClass<>(arr);

        if (myClass.contains(2)) {
            System.out.println("Да 2");
        } else {
            System.out.println("Нет 2");
        }


        if (myClass.contains(5)) {
            System.out.println("Да 5");
        } else {
            System.out.println("Нет 5");
        }

    }


}
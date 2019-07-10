package com.company.HomeWork23.ierarhija;

public class NotGen {

    int num;


    public NotGen(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}

class Gen1<T> extends NotGen{

    T object;

    public Gen1(int num, T object) {
        super(num);
        this.object = object;
    }


    public T getObject() {
        return object;
    }
}

class Test4{
    public static void main(String[] args) {
        Gen1<String>gen1 = new Gen1<>(10, "Test1");
        System.out.println(gen1.getNum());
        System.out.println(gen1.getObject());
    }
}

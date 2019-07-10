package com.company.HomeWork22.Generics;

public class GenTwo<T, V> {


    private T objectT;
    private V objectV;

    {
        System.out.println("Работа с обобщенным классом");
    }
    public GenTwo(T objectT) {
        this.objectT = objectT;
    }

    public GenTwo(T objectT, V objectV) {
        this.objectT = objectT;
        this.objectV = objectV;
    }

    public void setObjectT(T objectT) {

            this.objectT = objectT;
    }

    public void setObjectV(V objectV) {
        this.objectV = objectV;
    }

    public T getObjectT() {
        return objectT;
    }

    public V getObjectV() {
        return objectV;
    }

    void showTypes() {
        System.out.println("Тип объекта = "
                + objectT.getClass().getName());
        System.out.println("Тип объекта = "
                + objectV.getClass().getName());
    }
}


class Test1 {
    public static void main(String[] args) {
        GenTwo<Integer, String> genTwo = new GenTwo<>(15, "Test");
        genTwo.showTypes();
        String str = genTwo.getObjectV();

        GenTwo<Integer, Double> genTwo1 = new GenTwo<>(15, 25.0);
        System.out.println(genTwo.getObjectT());
    }

}
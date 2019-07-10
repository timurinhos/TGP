package com.company.HomeWork25.Lesson26;

import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("Начальный празмер коллекции " + arrayList.size());
        arrayList.ensureCapacity(10);
        arrayList.add("B");
        arrayList.add("B");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("B");
       //arrayList.add(1,"Z");
        System.out.println("Текущий размер коллекции " + arrayList.size());
        //arrayList.removeAll(arrayList);
        arrayList.remove(5);

        System.out.println("Текущий размер коллекции " + arrayList.size());
        System.out.println(arrayList);
//        for(String s: arrayList){
//            System.out.println(s);
//        }
//        for (int i = 0; i <  3; i++) {
//            System.out.println(arrayList.get(i));
//
//        }
    }
}
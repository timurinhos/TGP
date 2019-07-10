package com.company.HomeWork23.arr;



public class GenArr <T extends Number>{
    T o;

    T arr[];

    public GenArr(T o, T[] arr) {
        this.o = o;
        this.arr = arr;
        //this.arr = new T[10];//нельзя создать массив типа Т
    }
}
class Rub{
    public static void main(String[] args) {
        Integer[]arr = {1,2,3,4,5,6};

        GenArr<Integer>genArr = new GenArr<>(20, arr);

        //GenArr<Integer>[] arrGen = new GenArr<Integer>[10];

       GenArr<?>[] arrGen = new GenArr<?>[10];
    }
}
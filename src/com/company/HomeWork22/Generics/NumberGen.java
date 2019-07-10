package com.company.HomeWork22.Generics;
//Ограниченные шаблоны
public class NumberGen<T extends Number> {

    T number;
    //V string;

    public NumberGen(T number) {
        this.number = number;
    }

    double reciprocal() {
        return 1 / number.doubleValue();
    }

    double fractional() {
        return number.doubleValue() - number.intValue();
    }


    public static void main(String[] args) {
        //Вариант 1
//        NumberGen<Double>number = new NumberGen<>(15.5);
//        System.out.println(number.reciprocal());
//        System.out.println(number.fractional());
//        //NumberGen<String>number2 = new NumberGen<>(15);//не допускается
        //Вариант 2

        NumberGen<Double> numberD = new NumberGen<>(1.25);
        NumberGen<Float> numberF = new NumberGen<>(1.25f);
        NumberGen<Integer> numberI = new NumberGen<>(1);
//        A a = new A(15);


        if (numberD.absEqual(numberI)) {
            System.out.println("Абсолютные значения совпадают");

        } else {
            System.out.println("Абсолютные  значения не совпадают");
        }


    }

    boolean absEqual(NumberGen<?> object) {
        if (Math.abs(number.doubleValue()) == Math.abs(object.number.floatValue()))
            return true;
        return false;
    }
}

//class A extends NumberGen {
//
//    public A(Number number) {
//        super(number);
//    }
//}
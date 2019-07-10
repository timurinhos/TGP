package com.company.HomeWork23.constr;

public class Sum {

    private int sum;

    <T extends Number> Sum(T sum) {
        this.sum = 0;

        for (int i = 0; i < sum.doubleValue(); i++) {
            this.sum += i;
        }

    }

    public int getSum() {
        return sum;
    }
}

class Test1{
    public static void main(String[] args) {
        Sum sum = new Sum(10.0f);

        System.out.println("Сумма всех чиссел числа 5 " + sum.getSum());
    }
}
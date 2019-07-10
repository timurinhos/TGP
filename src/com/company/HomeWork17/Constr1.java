package com.company.HomeWork17;

public class Constr1 {

    int sum;

    public Constr1() {
    }

    public Constr1(int num) {
        sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
    }

    public Constr1(Constr1 constr1) {
        this.sum = constr1.sum;
    }
}

class Runner {
    public static void main(String[] args) {
        Constr1 constr1 = new Constr1(5);
        Constr1 constr2 = new Constr1(constr1);

        System.out.println("с1 = " + constr1.sum);
        System.out.println("c2 = " + constr2.sum);


    }
}
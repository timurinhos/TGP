package com.company.HomeWork17;

public class Constr {

    int x;

    public Constr() {
    }

    public Constr(int x) {
        this.x = x;
    }

    public Constr(double x) {
        this.x = (int) x;
    }

    public Constr(int x, int y) {
        this.x = x + y;
    }
}

class Run2{
    public static void main(String[] args) {
        Constr constr = new Constr();
        Constr constr1 = new Constr(1);
        Constr constr2 = new Constr(12.0);
        Constr constr3 = new Constr(3,8);
    }
}
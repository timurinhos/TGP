package com.company.HomeWork22;

public interface Interface {

    boolean end();

    Object current();

    void next();

}

class OutIter {

    private Object[] arr;
    private int next = 0;

    public OutIter(int size) {
        this.arr = new Object[size];
    }

    public void add(Object a) {
        if (next < arr.length) {
            this.arr[next++] = a;
        }
    }

    class Inner implements Interface {
        private int i = 0;

        @Override
        public boolean end() {
            return i == arr.length;
        }

        @Override
        public Object current() {
            return arr[i];
        }

        @Override
        public void next() {
            if (i < arr.length) {
                i++;
            }
        }
    }

//    public Interface inter() { return new Inner(); }

    public static void main(String[] args) {
        OutIter out = new OutIter(10);
        for (int i = 0; i < 10; i++) {
            out.add(Integer.toString(i));
        }
//        Interface anInterface = out.inter();
        Interface anInterface = out.new Inner();
        while (!anInterface.end()) {
            System.out.print(anInterface.current() + " ");

            anInterface.next();
        }
    }

}




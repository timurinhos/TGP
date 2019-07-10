package com.company.HomeWork17;

public class MyClass {
    String s;

    public MyClass(String s) {
        this.s = s;
    }

   static void changeField(MyClass myClass){
        myClass.s = "*********";
    }

    static MyClass changeRow(MyClass myClass3){
        myClass3 = new MyClass("--------");
        return myClass3;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "s='" + s + '\'' +
                '}';
    }
}
class MyClassRun{
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass("1");
        MyClass myClass2 = new MyClass("2");

        MyClass.changeField(myClass1);
        MyClass.changeRow(myClass2);

        System.out.println(myClass1.s);
        System.out.println(myClass2.s);

    }

}

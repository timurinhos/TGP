package com.company.HomeWork16;


public class C {
//1)
// C() {}//у каждого класса обязан быть хотя бы один конструктор, это принципиально

    //=================
//2.1)
//    int C(int k) {//если добавит возвращаемое значение
//        return 1;//и ретурн, то конструктор станет методом
//    }
//    C(String s) {
//    }
//=================
//2.2)
//    int x;
//    C(int k) {
//    }
//    C(String s) {
//      this.x = 12;//это ссылка на самого себя
//        //Аналогия
//        Thread thread = Thread.currentThread();
//        C me = this;
//    }
//==================
// 2.3
//    String name;
//    C(String name) {
//        name = name;//Это бессмысленно
//    }
// ==================
//// 2.4
//    String xxx = "A";
//    //C(String name) {
////    C(String arg) {
////    C(String aName) {
////        System.out.println(name);
//    C(String name){
//        this.name = null;
// }
// ====================
//// 3.0
//    C(String str) {
//        this(12);
//    }
//    C (int k){}
//}
// 4 пример
// =================
//    public int age;
//    C(String str){
//        this(Integer.valueOf(str));
//        System.out.println("Hello");
//    }
//    C (int age){
////        this.age = age;
//        this(10);
//    }
//
// ===================
// 5
//    public int age;
//    C(String str){
//        this(0);
//    }
//    C(int age){
//        if()
//        this("");
//    }
// =============
// 6
   public int age;
   C(){

       this(18);
   }
   C(int age)
   {
       this.age = age;
   }
}

class Test {
    public static void main(String[] args) {
//1
//     C c = new C();
//=====================
//2.1
//     new C("").C(4);
// =====================
//2.2
//     new C("B");
//2.4.
// ===========
// 3
// 4
        C c = new C();
        System.out.println(c.age);
    }
}



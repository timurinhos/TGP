package com.company.HomeWork13;
//5) Даны два предложения на английском языке. Найти общее количество букв h в них. (Определить метод для расчета количества букв h в предложении.)

public class MethodTwoStrings {

    public static void main(String[] args) {

      String str1 = "hello honey is very tasty";
      String str2 = "how is it going?";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println("Общее количесвто h = " + (SymbolH(str1) + SymbolH(str2)));
    }

    static int SymbolH(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'h') {
                count++;
            }
        }
        return count;
    }
}

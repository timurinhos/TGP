package com.company.HomeWork9;
//3.Напишите программу Java, чтобы проверить, содержит ли указанная строка указанную последовательность значений символов.
public class String3 {

    public static void main(String[] args) {

        String str = "Привет";

        if(str.contains("При")){
            System.out.println("Содержит");
        }else {
           System.out.println("Не содержит");
        }

    }
}

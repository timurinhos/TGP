package com.company.HomeWork9;

public class ReExp {
    public static void main(String[] args) {
        String email = "test@gmail.com";
        if(email.matches("\\w+@\\w+\\.\\w+")){
            System.out.println("Ввод верный");
        }else {
            System.out.println("ввод не верный");
        }

        //System.out.println(email.replace("rest"));
    }
}

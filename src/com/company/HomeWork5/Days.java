package com.company.HomeWork5;
//Составить программу, которая в зависимости от порядкового номера дня недели (1, 2 … 7) выводит на экран его название (понедельник, вторник … воскресение)
import java.util.Scanner;
public class Days {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите порядковый номер дня недели:");
        int x = scan.nextInt();
        scan.close();

        switch (x){

            case 1:{
                System.out.println("Понедельник");
                break;
            }
            case 2:{
                System.out.println("Вторник");
                break;
            }
            case 3:{
                System.out.println("Среда");
                break;
            }
            case 4:{
                System.out.println("Четверг");
                break;
            }
            case 5:{
                System.out.println("Пятница");
                break;
            }
            case 6:{
                System.out.println("Суббота");
                break;
            }
            case 7:{
                System.out.println("Воскресенье");
                break;
            }
            default:
        }
            if (x == 0 || x > 7){
                System.out.println("Вы ввели не существующий порядковый номер дня недели!");
            }
    }
}

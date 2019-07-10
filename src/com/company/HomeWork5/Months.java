package com.company.HomeWork5;
//Составить программу, которая в зависимости от порядкового номера месяца (1, 2 … 12) выводит на экран кол-во дней в этом месяце (не високосный год)
import java.util.Scanner;
public class Months {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите порядковый номер месяца:");
        int x = scan.nextInt();
        scan.close();

        switch (x){

            case 1:{
                System.out.println("В Январе 31 день");
                break;
            }
            case 2:{
                System.out.println("В Феврале 28 дней");
                break;
            }
            case 3:{
                System.out.println("В Марте 31 день");
                break;
            }
            case 4:{
                System.out.println("В Апреле 30 дней");
                break;
            }
            case 5:{
                System.out.println("В Мае 31 день");
                break;
            }
            case 6:{
                System.out.println("В Июне 30 дней");
                break;
            }
            case 7:{
                System.out.println("В Июле 31 день");
                break;
            }
            case 8:{
                System.out.println("В Августе 31 день");
                break;
            }
            case 9:{
                System.out.println("В Сентябре 30 дней");
                break;
            }
            case 10:{
                System.out.println("В Октябре 31 день");
                break;
            }
            case 11:{
                System.out.println("В Ноябре 30 дней");
                break;
            }
            case 12:{
                System.out.println("В Декабре 31 день");
                break;
            }
            default:
        }
        if (x == 0 || x > 12){
            System.out.println("Вы ввели не существующий порядковый номер месяца!");
        }
    }

}

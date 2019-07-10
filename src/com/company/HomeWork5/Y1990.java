package com.company.HomeWork5;
import java.util.Scanner;
//С начала 1990 года (01.01.90) по некоторый день прошло n (запросить у пользователя) месяцев и 2 дня. Определить название месяца.
public class Y1990 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сколько прошло месяцев с 1990 года:");
        int n = scan.nextInt();
        scan.close();

        int m = n % 12;

        switch (m){

            case 0: {
                System.out.println("Январь");
                break;
            }
            case 1:{
                System.out.println("Февраль");
                break;
            }
            case 2:{
                System.out.println("Март");
                break;
            }
            case 3:{
                System.out.println("Апрель");
                break;
            }
            case 4:{
                System.out.println("Май");
                break;
            }
            case 5:{
                System.out.println("Июнь");
                break;
            }
            case 6:{
                System.out.println("Июль");
                break;
            }
            case 7:{
                System.out.println("Август");
                break;
            }
            case 8:{
                System.out.println("Сентябрь");
                break;
            }
            case 9:{
                System.out.println("Октябрь");
                break;
            }
            case 10:{
                System.out.println("Ноябрь");
                break;
            }
            case 11:{
                System.out.println("Декабрь");
                break;
            }
            default:
        }

    }

}

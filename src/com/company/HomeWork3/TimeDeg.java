package com.company.HomeWork3;
//Часовая стрелка образует угол y с лучом, проходящим через центр и через точку,соответствующую 12 часам на циферблате,0 < y ≤ 2π . Определить значение угла для минутной стрелки, а также количество часов и полных минут
import java.util.Scanner;
public class TimeDeg {

    public static void main(String[] args) {

        double h, m, arrowm, arrowh;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите угол:");
        arrowh = scan.nextDouble();
        scan.close();
        arrowm = arrowh % 30;
        h = (arrowh - arrowm) / 30;
        m = arrowm * 2;
        arrowm *= 12;


        System.out.println("Значение угла минутнной стрелки: " + arrowm);
        System.out.println("Полные часы: " + h);
        System.out.println("Полные минуты: " + m);

    }

}

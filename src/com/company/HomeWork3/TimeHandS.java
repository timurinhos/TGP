package com.company.HomeWork3;
//С начала суток часовая стрелка повернулась на y градусов (0 ≤ y <360, y — вещественное число). Определить число полных часов и полных минут, прошедших с начала суток
import java.util.Scanner;
public class TimeHandS {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите угол:");
        int deg = scan.nextInt();

        int allHour = deg / 30;
        float allMinute = deg / 0.5f;

        System.out.println("Полные часы: " + allHour);
        System.out.println("Полные минуты: " + allMinute);
        scan.close();
    }
}

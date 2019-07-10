package com.company.HomeWork17;
////Создайте класс Date, у которого будут приватные поля - месяц, день и год.
////В вашем классе должен быть конструктор, который инициализирует три переменные экземпляра и предполагает, что предоставленные значения верны.
////Создайте геттеры и сеттеры для каждой переменной класса.
////Создайте метод displayDate, который отображает месяц, день и год, разделенные косой чертой (/).
////Напишите тестовое приложение с именем DateTest, которое демонстрирует возможности ClassDate.
////(Пользователь вводит день месяц и год)
import java.util.Scanner;
public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() { return day; }

    public void setDay(int day) { this.day = day; }

    public int getMonth() { return month; }

    public void setMonth(int month) { this.month = month; }

    public int getYear() { return year; }

    public void setYear(int year) { this.year = year; }

    public void displayDate(Date date) {

        if (date.day >= 1 && date.day <= 31 && date.month >= 1 && date.month <= 12 && date.year <= 2019){
            System.out.println("Ваша дата: " + "\n" + date.day + "/" + date.month + "/" + date.year);
        }else{
            System.out.println("Вы ввели несуществующий день или месяц или год!");
        }

    }

    public void Scan(Date date) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите день: ");
        date.day = scan.nextInt();
        System.out.println("Введите месяц: ");
        date.month = scan.nextInt();
        System.out.println("Введите год: ");
        date.year = scan.nextInt();
        scan.close();
    }
}
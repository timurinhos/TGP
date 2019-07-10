package com.company.HomeWork21.Shape;
//Задача: создать программу, которая отображает следующее меню и запрашивает у пользователя соответствующую информацию:
//1) Введите блок
//2) Введите сферу
//3) Введите пирамиду
//4) Показать данные
//5) Выход
//Если пользователь выбирает
//вариант 1, попросите пользователя ввести длину блока, ширину и высоту
//Вариант 2, попросите пользователя ввести радиус сферы
//Вариант 3, попросите пользователя ввести длину и ширину основания, а затем высоту пирамиды
//Вариант 4 должен отображать все введенные фигуры, а также объем и площадь каждой фигуры. После отображения всех данных также отображается средний объем и средняя площадь поверхности всех введенных фигур.
//* Пользователь должен иметь возможность вводить до 10 фигур. Предположим, что все введенные данные действительны (т. е. Вам не нужно проверять наличие отрицательных чисел для размеров фигуры или «плохих» символов и т. Д.).
//** Иерархия наследования классов должна быть реализована, и основная программа должна использовать полиморфизм для управления и отображения данных формы. Вы можете использовать либо интерфейсы Java, либо абстрактные классы, и абстрактные методы.
import java.util.Scanner;
public class ShapeRun {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Shape[] shapes = new Shape[10];

        int index = 0;
        int num = 0;

        while (num != 5) {

            System.out.println("1)Введите блок");
            System.out.println("2)Введите сферу");
            System.out.println("3)Введите пирамиду");
            System.out.println("4)Показать данные");
            System.out.println("5)Выход");
            num = scan.nextInt();
            double lenghtS, widthS, heightS;
            switch (num) {
                case 1:
                    System.out.println("Введите длину блока: ");
                    lenghtS = scan.nextDouble();
                    System.out.println("Введите ширину блока: ");
                    widthS = scan.nextDouble();
                    System.out.println("Введите высоту блока: ");
                    heightS = scan.nextDouble();
                    shapes[index] = new Block(lenghtS, widthS, heightS, "блок");
                    index++;
                    break;
                case 2:
                    System.out.println("Введите радиус сферы: ");
                    lenghtS = scan.nextDouble();
                    shapes[index] = new Sphere(lenghtS, "сфера");
                    index++;
                    break;
                case 3:
                    System.out.println("Введите длину пирамиды: ");
                    lenghtS = scan.nextDouble();
                    System.out.println("Введите ширину пирамиды: ");
                    widthS = scan.nextDouble();
                    System.out.println("Введите высоту пирамиды: ");
                    heightS = scan.nextDouble();
                    shapes[index] = new Pyramid(lenghtS, widthS, heightS, "пирамида");
                    index++;
                    break;
                case 4:
                    double midSquare = 0;
                    double midVolume = 0;
                    for (int i = 0; i < index; i++) {
                        shapes[i].showShape(i + 1);
                        midSquare += shapes[i].getSquare();
                        midVolume += shapes[i].getVolume();
                    }
                    System.out.println("Средняя площадь фигур = " + midSquare / index + 1);
                    System.out.println("Средний объем фигур = " + midVolume / index + 1);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Вы успешно вышли!");
                    break;
            }
            if (index > shapes.length) {
                System.out.println("Нельзя создавать больше 10 фигур!");
            }
            if (num != 1 && num !=2 && num !=3 && num !=4 && num !=5){
                System.out.println("Вы ввели неверную операцию!");

            }
        }
        scan.close();
    }
}

package com.company.HomeWork6;

import java.io.IOException;

/**
 * Created by Евгений on 17.12.2018.
 */
public class WhileEx {
    public static void main(String[] args) throws IOException {

        ///////////FOR

//        double num, sroot, rerr;
//        for (num = 1.0; num < 100.0; num++) {
//            sroot = Math.sqrt(num);
//            System.out.println("Kopeнь квадратный из " + num + "равен" + sroot);
//            // вычислить ошибку округления
//            rerr = num - (sroot * sroot);
//            System.out.println("Ошибкa округления: " + rerr);
//            System.out.println();
//
//            //Цикл for, выполняющийся с отрицательным приращением переменной
//            int x;
//            for (x = 100; x > -100; x -= 5) {
//                System.out.println(x);
//            }
//            //проверка условия в цикле for
//            for (int count = 10; count < 5; count++) {
//                x += count; // этот оператор не будет выполнен
//            }
//
//            //разновидности цикла for
//            int i, j;
//            for (i = 0, j = 10; i < j; i++, j--)
//                System.out.println("i и j: " + i + "" + j);
//
//
//            //цикл без тела
//            int i1;
//            int sum = 0;
//            for (i1 = 1; i1 <= 5; sum += i1++) ;
//            System.out.println("Cyммa: " + sum);
//
//            ////Объявление управляющих пересменных в цикле for
//            int sum1 = 0;
//            int fact = 1;
//            // Вычисление факториала чисел от 1 до 5
//            for (int i2 = 1; i2 <= 5; i2++) {
//                sum += i2; // переменная i доступна во всем цикле
//                fact *= i2;
//                // однако здесь переменная i недоступна
//                System.out.println("Cyммa: " + sum);
//                System.out.println("Фaктopиaл: " + fact);

        // /////////WHILE
        char ch;
        // вывести буквы английского алфавита, используя цикл while
        ch = 'a';
        while (ch <= 'z') {
            System.out.print(ch + " ");
            ch++;
        }


        //вычисление целых степеней числа 2
        int e;
        int result;

        for (int i = 0; i < 10; i++) {
            result = 1;
            e = i;
            while (e > 0) {
                result *= 2;
                e--;
            }
            System.out.println("2 в степени " + i +
                    " равно " + result);
        }

        //Еще один пример
        int n = 10;
        while (n > 0) {
            System.out.println(" тaкт " + n);
            n--;
        }

//цикл без тела
        int i = 100;
        int j = 200;
        // рассчитать среднее значение переменных i и j
        while (++i < --j) ;
        // у этого цикла отсутствует тело
        System.out.println(" Cpeднee значение равно " + i);
        //
        int a = 10, Ь = 20;
        while (a > Ь) {
            System.out.println(" Этa строка выводиться не будет ");
        }
//пример do while
        int nn = 10;

        do {
            System.out.println(" тaкт " + n);
            nn --;
        } while(n > 0);
    }
}
package com.company.itstep.ua.Lesson13;

public class Visability {
    private static int a = 0;
    protected static int c = 0;

    public static void main(String[] args) {

//        {
//            int a = 10;
//            System.out.println("a= " + a);
//
//        }


        System.out.println("Начало программы");
        String global = "Глобальная перемнная";
        {
            String local = "Локалльная перемнная";

            {
                System.out.println("Локальная область" + a);
                System.out.println("Глобальная = " + global);
                System.out.println("Локальная = " + local);
            }
        }

        System.out.println("Глоб область: ");
        System.out.println("Глобальная перемнная " + global);
        //System.out.println("Глобальная перемнная " + local);
        System.out.println("Конец прогарммы");


    }

}
package com.company.HomeWork18;

/**
 * Created by Евгений on 06.02.2019.
 */
public class Test {
    public static void main(String[] args) {




        //напишите тут ваш код
        Human grandpa1 = new Human("Nikolay", true, 72);
        Human grandpa2 = new Human("Alexey,", true, 67);
        Human grandma1 = new Human("Olga", false, 71);
        Human grandma2 = new Human("Irina", false, 70);
        Human father = new Human("Pavel", true, 47, grandpa1, grandma1);
        Human mother = new Human("Ekaterina", false, 46, grandpa2, grandma2);
        Human child1 = new Human("Ivan", true, 20, father, mother);
        Human child2 = new Human("Maria", false, 23, father, mother);
        Human child3 = new Human("Stanislav", true, 18, father, mother);

//
        System.out.println(grandpa1);
        System.out.println(grandpa2);
        System.out.println(grandma1);
        System.out.println(grandma2);
//        System.out.println(father);
//        System.out.println(mother);
//        System.out.println(child1);
//        System.out.println(child2);
//        System.out.println(child3);
    }
}
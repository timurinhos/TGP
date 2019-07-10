package com.company.HomeWork16;

public class HumanRun {
    public static void main(String[] args) {

      Human grandfather1 = new Human("Саша", true, 81);
      Human grandfather2 = new Human("Паша", true, 78);
      Human grandmother1 = new Human("Надя", false, 75);
      Human grandmother2 = new Human("Нина", false, 70);
      Human father = new Human("Костя", true, 35, grandfather1, grandmother1);
      Human mother = new Human("Инна", false, 33, grandfather2, grandmother2);
      Human child1 = new Human("Валя", false, 9, father, mother);
      Human child2 = new Human("Марк", true, 7, father, mother);
      Human child3 = new Human("Данил", true, 12, father, mother);

      System.out.println(grandfather1);
      System.out.println(grandfather2);
      System.out.println(grandmother1);
      System.out.println(grandmother2);
      System.out.println(father);
      System.out.println(mother);
      System.out.println(child1);
      System.out.println(child2);
      System.out.println(child3);

    }
}

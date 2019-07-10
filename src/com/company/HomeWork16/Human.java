package com.company.HomeWork16;
//2)Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создайте объекты и заполните их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
//Инициализация полей производится с помощью конструкторов.
//Примечание:
//Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
public class Human {

    String name;
    boolean sex;
    int age;
    String father;
    String mother;

    public Human(String name, boolean sex, int age ) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Human(String name, boolean sex, int age, Human father, Human mother ){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father.name;
        this.mother = mother.name;
    }

    public String toString()
    {
        String text = "";
        text += "Имя: " + this.name;
        text += ", пол: " + (this.sex ? "мужской" : "женский");
        text += ", возраст: " + this.age;

        if (this.father != null) {
            text += ", отец: " + this.father;
        }else {
            text += "";
        }
        if (this.mother != null) {
            text += ", мать: " + this.mother;
        }else {
            text += "";
        }
        return text;
    }
}

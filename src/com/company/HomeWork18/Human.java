package com.company.HomeWork18;

/**
 * Created by Евгений on 06.02.2019.
 */
public class Human {
    //напишите тут ваш код
    private String name;
    private boolean sex;
    private int age;
    private Human father;
    private Human mother;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    Human(String name, boolean sex, int age, Human father, Human mother) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public String toString() {
        String text = "";
        text += "Имя: " + this.name;
        text += ", пол: " + (this.sex ? "мужской" : "женский");
        text += ", возраст: " + this.age;
        if (this.father != null)
            text += ", отец: " + this.father.name;
        if (this.mother != null)
            text += ", мать: " + this.mother.name;
        return text;
    }


//    @Override
//    public String toString() {
//        return "Human{" +
//                "name='" + name + '\'' +
//                ", sex=" + sex +
//                ", age=" + age +
//                ", father=" + father +
//                ", mother=" + mother +
//                '}';
//    }
}


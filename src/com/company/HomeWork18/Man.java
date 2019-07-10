package com.company.HomeWork18;
//1)Создать класс Man (человек), с полями: имя, возраст, пол и вес. Определить методы задания имени, возраста и веса. Создать производный класс Student, имеющий поле года обучения. Определить методы задания и увеличения(изменения) года обучения. У обоих классов должны быть конструкторы по умолчанию и с параметрами. В классе Man создайте метод show, который будет выводить на консоль информацию о человеке. В классе Student метод show нужно переопределить таким образом, чтоб выводилась информация про год обучения.
public class Man {

    private String name;
    private int age;
    private boolean sex;
    private int weight;

    public String getName() { return name; }
    public int getAge() { return age; }
    public int getWeight() { return weight; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setWeight(int weight) { this.weight = weight; }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void Show(){
        System.out.println("Имя: " + getName() + ", Возраст: " + getAge() + ", Пол: " + (sex ? "мужской" : "женский") + ", Вес: " + getWeight());
    }

}

class Student extends Man {

    private int yearofstudy;

    public Student(String name, int age, boolean sex, int weight, int yearofstudy) {
        setName(name);
        setAge(age);
        setWeight(weight);
        setSex(sex);
        this.yearofstudy = yearofstudy;
    }

    public int getYearofstudy() { return yearofstudy; }
    public void setYearofstudy(int yearofstudy) { this.yearofstudy = yearofstudy; }

    public int Addyear(){
        return yearofstudy + 1;
    }

    @Override
    public void Show() {
        System.out.print("Год обучения: " + getYearofstudy() + "-" + Addyear() + ", ");
        super.Show();
    }
}

class ManTest {

    public static void main(String[] args) {

        Student student1 = new Student("Алекс", 20, true, 70, 2018);
        Student student2 = new Student("Макс", 21, true, 73, 2017);
        Student student3 = new Student("Андрей", 23, true, 77, 2018);
        Student student4 = new Student("Маша", 22, false, 57, 2018);

        student1.Show();
        student2.Show();
        student3.Show();
        student4.Show();

    }
}

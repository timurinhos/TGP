package com.company.HomeWork19;
//Создайте абстрактный класс Profession с приватными полями «Имя» и «Промышленность». У этого класса должен быть абстрактный метод «Делать Работу».  Создайте класс «Разработчик» с приватным полем «Специальность», который наследует класс Profession и реализует абстрактный метод. Так же создайте класс «Пилот», с приватным полем «Тип самолета», который также наследует класс Profession и реализует абстрактный метод. В классе Runner должны быть созданы экземпляры классов «Пилот» и «Разработчик», а также экземпляр типа Profession который создает еще одного разработчика. Все параметры задаются в конструкторе, конструкторы классов наследников основаны на конструкторе класса родителя. Так же во всех классах где необходимо должны быть созданы методы для работы с параметрами и организован вывод данных (toString).
public abstract class Profession {

    private String name;
    private String industry;

    public Profession(String name, String industry) {
        this.name = name;
        this.industry = industry;
    }

    public String getName() { return name; }
    public String getIndustry() { return industry; }

    public abstract String do_work();
    }

//____________________________________________________________________
class Developer extends Profession{

    private String Specialty;

    public Developer(String name, String industry, String specialty) {
        super(name, industry);
        Specialty = specialty;
    }

    @Override
    public String do_work() {
      return "Делает свою работу!";
    }

    @Override
    public String toString() {
        return "Имя: " + getName() + ", Промышленность: " + getIndustry() + ", Специальность: " + Specialty;

    }
}
//______________________________________________________________________
class Pilot extends Profession{

    private String typeofairplane;

    public Pilot(String name, String industry, String typeofairplane) {
        super(name, industry);
        this.typeofairplane = typeofairplane;
    }

    @Override
    public String do_work() {
        return "Делает свою работу!";
    }

    @Override
    public String toString() {
        return "Имя: " + getName() + ", Промышленность: " + getIndustry() + ", Тип самолета: " + typeofairplane;
    }
}

class Runner {

    public static void main(String[] args) {

        Developer developer1 = new Developer("Артем", "Програмирование", "Разработка программ на C++");
        Pilot pilot = new Pilot("Андрей", "Управление самолетом", "Грузовой");
        Profession developer2 = new Developer("Алексей", "Програмирование", "Java-программист");

        System.out.println(developer1 + ", " + developer1.do_work());
        System.out.println(developer2 + ", " + developer1.do_work());
        System.out.println(pilot + ", " + pilot.do_work());


    }
}


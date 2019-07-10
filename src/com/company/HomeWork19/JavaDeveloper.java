package com.company.HomeWork19;

public class JavaDeveloper implements Developer1, Human1{

    private String name;

    public JavaDeveloper(String name) {
        this.name = name;
    }

    @Override
    public String WriteCod() { return "Пишет код..."; }
    @Override
    public String EnjoyLife() { return "Наслаждаеться жизнью)"; }
    @Override
    public String Breathe() { return "Дышит"; }

    @Override
    public String toString() {
        return name + " "+ WriteCod() + " и " + EnjoyLife();
    }
}

class CppDeveloper implements Developer1, Human1{

    private String name;

    public CppDeveloper(String name) {
        this.name = name;
    }

    @Override
    public String WriteCod() { return "Пишет код..."; }
    @Override
    public String EnjoyLife() { return "Наслаждаеться жизнью)"; }
    @Override
    public String Breathe() { return "Дышит"; }

    @Override
    public String toString() {
        return name +" "+ Breathe() ;
    }
}

class DeveloperRunner {

    public static void main(String[] args) {

        JavaDeveloper developer1 = new JavaDeveloper("Томас");
        CppDeveloper developer2 = new CppDeveloper("Иван");

        System.out.println(developer1);
        System.out.println(developer2);

    }
}
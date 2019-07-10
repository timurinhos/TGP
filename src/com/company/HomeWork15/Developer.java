package com.company.HomeWork15;

public class Developer extends Object {

    //Это атрибуты разработчика
    private String name;
    private int age;
    private String specialty;
    private double salry;
    private String exp;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getSalry() {
        return salry;
    }

    public void setSalry(double salry) {
        this.salry = salry;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public void writeCode(){
        System.out.println("Разработчик пишет код...");
    }

    public void getDepressed(){
        System.out.println("У него ничего не получается...");
    }

    public void solveProblem(){
        System.out.println("Проблема решена");
    }

    public void enjoy(){
        System.out.println(" Ура!!! Проет готов!!!!");
    }

    @Override
    public String toString() {
        return "Developer" +
                "name=" + name + '\'' +
                ", age=" + age +
                ", specialty=" + specialty + '\'' +
                ", salry=" + salry +
                ", exp='" + exp;
    }
}

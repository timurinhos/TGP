package com.company.HomeWork15;


public class Run {
    public static void main(String[] args) {
        Developer developer = new Developer();
        //Circle circle = new Circle();
        CircleRun.main(args);


        developer.setName("Jeck");
        developer.setSalry(10000);
        developer.setSpecialty("Java");
        developer.setAge(18);

        developer.writeCode();
        developer.getDepressed();
        developer.solveProblem();
        developer.enjoy();

        System.out.println("ЗАРПЛАТА!!! "+developer.getSalry());
        System.out.println(developer);
    }
}

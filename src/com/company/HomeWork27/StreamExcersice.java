package com.company.HomeWork27;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExcersice {

	private enum Sex {
        MAN,
        WOMEN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Sex sex;

        public Student(String name, Integer age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Sex getSex() {
            return sex;
        }

        @Override
        public String toString() {
            return "Имя: " + name +
                    ", Возраст: " + age +
                    ", Пол: " + sex;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student people = (Student) o;
            return Objects.equals(name, people.name) &&
                    Objects.equals(age, people.age) &&
                    Objects.equals(sex, people.sex);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, sex);
        }
    }
	
    static Collection<Student> students = Arrays.asList(
            new Student("Вася", 16, Sex.MAN),
            new Student("Петя", 23, Sex.MAN),
            new Student("Соня", 18, Sex.WOMEN),
            new Student("Виктор Петрович", 65, Sex.MAN),
            new Student("Дима", 25, Sex.MAN),
            new Student("Катя", 21, Sex.WOMEN),
            new Student("Семен", 33, Sex.MAN),
            new Student("Елена", 42, Sex.WOMEN),
            new Student("Иван Иванович", 69, Sex.MAN),
            new Student("Аня Уткина", 55, Sex.WOMEN)
    );
    
    static void ex01() {
    	// TODO: Задание 1
    	// Выбрать всех мужчин-военнообязанных (возраст от 18 до 27 лет)

        students.stream()
                .filter((p) -> p.getAge() >= 18 && p.getAge() < 27 && p.getSex() == Sex.MAN)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
    
    static void ex02() {
    	// TODO: Задание 2
    	// Найти средний возраст среди мужчин

        double Average = students.stream()
                .filter((p) -> p.getSex() == Sex.MAN)
                .mapToInt(Student::getAge).average().getAsDouble();

        System.out.println("Средний возраст мужчин: " + Average);
    }
    
    static void ex03() {
    	// TODO: Задание 3
    	// Найти кол-во потенциально работоспособных 
    	// студентов в выборке (т.е. от 18 лет и учитывая 
    	// что женщины выходят в 55 лет, а мужчина в 60)

        long workers = students.stream()
                .filter((p) -> p.getAge() >= 18)
                .filter((p) -> (p.getAge() < 55 && p.getSex() == Sex.WOMEN) || (p.getAge() < 60 && p.getSex() == Sex.MAN))
                .count();

        System.out.println("Количество потенциальных рабочих: " + workers);
    	
    }
    
    static Collection<Student> ex04() {
        // TODO: Задание 4
        // Отсортировать студентов по имени в обратном алфавитном порядке

        students.stream()
                .sorted((p1, p2) -> p2.getName().compareTo(p1.getName()))
                .forEach(System.out::println);

        return students;
    }

    static void ex05() {
        //  TODO: Задание 5
        //  найти студента с максимальным возрастом

        Optional<Student> maxInt = students.stream()
                .max((a, b) -> a.getAge().compareTo(b.getAge()));

        if (maxInt.isPresent()) {
            Student maxAge = maxInt.get();
            System.out.println(maxAge);
        }

    }

    static void ex06() {
    	// TODO: Задание 6
    	// Найти студента с минимальным возрастом

        Optional<Student> minInt = students.stream()
                .min((a, b) -> a.getAge().compareTo(b.getAge()));

        if (minInt.isPresent()){
            Student minAge = minInt.get();
            System.out.println(minAge);
        }


    }
    
    public static void main(String[] args) {
		// TODO: тестировать здесь

        System.out.println("Задание 1: ");
        ex01();

        System.out.println("\nЗадание 2: ");
        ex02();

        System.out.println("\nЗадание 3: ");
        ex03();

        System.out.println("\nЗадание 4: ");
        ex04();

        System.out.println("\nЗадание 5: ");
        ex05();

        System.out.println("\nЗадание 6: ");
        ex06();

	}
} 

package com.company.HomeWork26;

import java.util.*;

class Student {
    String name;
    int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

class StudentName implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}

class StudentSalary implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getSalary() - student2.getSalary();
    }
}

public class MapEx {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Ваня";
        Map<String, Student> map = new HashMap<>();
        map.put("First", student);
        map.put("Second", student);
        //System.out.println(map);
//
        for (String string : map.keySet()) {
            System.out.println(map.get(string));
        }

        Iterator<Map.Entry<String, Student>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Student> entry = iter.next();
            String key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }


        for (Map.Entry<String, Student> studentEntry : map.entrySet()) {
            System.out.println("Ключ = " + studentEntry.getKey() +
                    " Значение = " + studentEntry.getValue());
        }

        Map<String, Student> map3 = new Hashtable<>();
        Map<String, Student> map1 = new LinkedHashMap<>();
//        map1.put("Second",new Student());
//        map1.put("First",new Student());
//        map1.put("ZX", new Student());
        System.out.println(map1);
        Map<String, Student> map2 = new TreeMap<>();

        map2.put("ZSecond", new Student());
        map2.put("CFirst", new Student());
        map2.put("AZX", new Student());
        System.out.println(map2);


    }
}

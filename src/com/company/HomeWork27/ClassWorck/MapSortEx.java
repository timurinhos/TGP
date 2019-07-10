package com.company.HomeWork27.ClassWorck;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class MapSortEx {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();
        students.put("Vasya", 22);
        students.put("Alex", 25);
        students.put("Petya", 21);

        System.out.println("students = " + students);

        LinkedHashMap<String,Integer> res = students.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue,
                        (x,y)->x, LinkedHashMap::new)
                );
        System.out.println("res = " + res);

        LinkedHashMap<String,Integer> res1 = students.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue,
                        (x,y)->x, LinkedHashMap::new)
                );
        System.out.println("res1 = " + res1);
    }
}

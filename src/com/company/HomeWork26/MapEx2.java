package com.company.HomeWork26;

import java.text.CollationKey;
import java.text.Collator;
import java.util.*;

class Car {
    String name;
    String vendor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
}

class Key {
    int number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return number == key.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}

class MapEx2 {
    public static void main(String[] args) {
        Key key = new Key();
        key.number = 123;
        Car car = new Car();
        car.name = "Prius";
        car.vendor = "Toyota";

        Map<Key, Car> garage = new HashMap<>();
        garage.put(key, car);

        Key key1 = new Key();
        key1.number = 123;

        Car car1 = garage.get(key1);
        System.out.println(car1.name);


        List<Car> cars = new ArrayList<>();

        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}

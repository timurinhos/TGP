package com.company.HomeWork11;

public class LinearSearch {
    public static void main(String[] args) {
        int myArr[] = {21, 35, 1, 3, 99, 65, 5, 33, 7, 8, 12};
        int num =33;
        int counter;
        for (counter = 0; counter < myArr.length; counter++) {
            if (myArr[counter] == num) {
                System.out.println(num + " наше искомое число найдено = " + (counter + 1));
                break;
            }
        }
        if (counter == myArr.length) {
            System.out.println("Число не найдено");
        }


    }

}

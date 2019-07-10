package com.company.HomeWork23.method;

public class MethodGen {


    static <T extends Comparable<T>, V extends T > boolean arrayEqual(T[]x , V[]y){
        if(x.length!=y.length) {
            return false;
        }
        for (int i = 0; i <x.length ; i++){
            if(!x[i].equals(y[i])){
                return false;

            }
        }
        return true;

    }


    public static void main(String[] args) {
        Integer []arr1 = {1,2,3,4,5,6};
        Integer []arr2 = {1,2,3,4,5,6};
        Integer []arr3 = {1,2,3,4,5,6,7};
        Integer []arr4 = {1,2,6,4,5,6};

        if (arrayEqual(arr1, arr2)){
            System.out.println("массивы arr1, arr2 подобны ");
        }
        if (arrayEqual(arr2, arr3)){
            System.out.println("массивы arr2, arr3 подобны ");
        }
        if (arrayEqual(arr1, arr4)){
            System.out.println("массивы arr1, arr4 подобны ");
        }
    }
}

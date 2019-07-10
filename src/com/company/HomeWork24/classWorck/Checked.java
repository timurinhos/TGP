package com.company.HomeWork24.classWorck;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Checked {
    public static void main(String[] args) {
try {//Uncheced


    String string = null;
    string.length();

}catch (NullPointerException e){
    e.printStackTrace();
}
    }

    File file = new File("file");//Checked

    Scanner scanner;
    {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

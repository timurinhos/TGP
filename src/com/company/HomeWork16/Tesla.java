package com.company.HomeWork16;

public class Tesla {

    int maxSpped;
    int currentSpeed;
    String vendor;
    String model;

    static final int speedOn = 5;

    public void stepOn() {
        if (currentSpeed + speedOn<=maxSpped){
            currentSpeed+=speedOn;
        }
    }


    public void showDescriptions() {
        System.out.println("Vendor: " + vendor + "\nModel: " + model
                + "\nCurrenSpeed" + currentSpeed);


    }
}

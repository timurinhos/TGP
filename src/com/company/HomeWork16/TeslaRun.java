package com.company.HomeWork16;

public class TeslaRun {
    public static void main(String[] args) {


        Tesla tesla = new Tesla();

        tesla.vendor = "Tesla";
        tesla.model = "ModelX";
        tesla.currentSpeed = 60;
        tesla.maxSpped = 312;

        tesla.showDescriptions();
        tesla.stepOn();
        tesla.showDescriptions();
    }


}

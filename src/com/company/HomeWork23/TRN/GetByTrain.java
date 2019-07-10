package com.company.HomeWork23.TRN;

public class GetByTrain implements Comparable<GetByTrain>{

    private String name;
    private int passengersC;
    private double baggagesC;
    private int comfortClass;
    private int railwayC;

    public GetByTrain(String name, int passengersC, double baggagesC, int comfortClass, int railwayC) {
        this.name = name;
        this.passengersC = passengersC;
        this.baggagesC = baggagesC;
        this.comfortClass = comfortClass;
        this.railwayC = railwayC;
    }

    public int getPassengersC() { return passengersC; }
    public double getBaggagesC() { return baggagesC; }
    public int getComfort() { return comfortClass; }
    public int getCarriage() {
        return railwayC;
    }

    @Override
    public int compareTo(GetByTrain bytrain) {
        return Integer.compare(this. getComfort(), bytrain. getComfort());
    }

    @Override
    public String toString() {
        return "Тип поезда: " + name + "" +
                ", Количество пассажиров: " + passengersC +
                ", Количество вмещаемого багажа: " + baggagesC + " тонн" +
                ", Класс комфорта: " + comfortClass +
                ", Количество вагонов: " + railwayC;
    }

}

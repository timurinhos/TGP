package com.company.HomeWork23.TRN;
import java.util.ArrayList;
import java.util.List;
public class Train extends PassAndBag {
    private GetByTrain [] getbyTrain;

    public Train(GetByTrain[] getbyTrain) {
        this.getbyTrain = getbyTrain;
    }

    @Override
    int AllPassangerC() { int count = 0;
        for (int i = 0; i < getbyTrain.length; i++) {
            count += (getbyTrain[i].getPassengersC() * getbyTrain[i].getCarriage());
        }
        return count;
    }
    @Override
    double AllBaggageC() { double count = 0;
        for (int i = 0; i < getbyTrain.length; i++) {
            count = count + getbyTrain[i].getBaggagesC();
        }
        return count; }

    public List<GetByTrain> filterPassengersC(GetByTrain[] trains, int minPassengers, int maxPassengers) {
        List<GetByTrain> filteredTrains = new ArrayList<>();
        for (int i = 0; i < trains.length; i++) {
            GetByTrain train = trains[i];
            if (train.getPassengersC() >= minPassengers
                    && train.getPassengersC() <= maxPassengers) {
                filteredTrains.add(train);
            }
        }
        return filteredTrains;
    }

    String TrainsInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (GetByTrain getbyTrain : getbyTrain) {
            stringBuilder = stringBuilder.append(getbyTrain.toString()).append("\n");
        }
        return stringBuilder.toString();
    }

}

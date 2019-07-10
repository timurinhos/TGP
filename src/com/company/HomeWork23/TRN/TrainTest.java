package com.company.HomeWork23.TRN;
//Транспорт. Определить иерархию подвижного состава железнодорожного транспорта. Создать пассажирский поезд. Подсчитать общую численность пассажиров и багажа. Провести сортировку вагонов поезда на основе уровня комфортности. Найти в поезде вагоны, соответствующие заданному диапазону параметров числа пассажиров.
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class TrainTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        GetByTrain[] getByTrains = new GetByTrain[]{

                new FastTrain("Скоростной поезд", 44, 9, 22, 16),
                new Locomotive("Локомотив", 55, 10, 25, 13),

        };

        Train train = new Train(getByTrains);
        System.out.println("Доступные поезда: ");
        Arrays.sort(getByTrains);
        System.out.println(train.TrainsInfo());
        System.out.println("Общая количество пассажиров всех доступных поездов: " + train.AllPassangerC() + " человек");
        System.out.println("Общая грузоподъёмность всех доступных поездов: " + train.AllBaggageC() + " тонн\n");
        System.out.println("Введите параметры для поиска поезда: ");
        int startRangePassengers = scan.nextInt();
        int endRangePassengers = scan.nextInt();
        List<GetByTrain> filteredPlanes = train.filterPassengersC(getByTrains, startRangePassengers, endRangePassengers);
        if (filteredPlanes.isEmpty()) {
            System.out.println("Нет поездов с вашими параметрами!");
        } else {
            filteredPlanes.stream().map(GetByTrain::toString).forEach(System.out::println);
        }

        scan.close();

    }
}

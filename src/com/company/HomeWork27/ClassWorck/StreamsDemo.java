package com.company.HomeWork27.ClassWorck;

import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class StreamsDemo {

//    static <T> void consumer(T inp) {
//        System.out.println(inp);
//    }
//
//    static void directStream() {
//        System.out.format("Stream%n------%n");
//        int[] arr = {1, 2, 3, 4, 5, 5, 2, 1};
//        String str = "Hello";
//        for (int item : arr) {
//            System.out.println("item = " + item);
//        }
//
////        IntStream.of(1,2,34);
////        LongStream;
////        DoubleStream
//
//    }

    static List<String> stringCollection = new ArrayList<>();


    static {
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
    }

    static void collectionStream() {
        System.out.format("Collection Stream%n------%n");
//        for (String item : stringCollection) {
//            System.out.println("item = " + item);
//        }

        stringCollection
                .stream()
                .forEach(System.out::println);

    }

    private static void filterExample() {
        System.out.format("Filter%n------%n");
        // print string starts with 'a'

//        List<String> res = new ArrayList<>();
//        for (String item : stringCollection) {
//            if (item.startsWith("a")) {
//                res.add(item);
//            }
//        }
//        for (String item : res) {
//            System.out.println("item = " + item);
//        }
        List<String> res = stringCollection.stream()
                .filter(s -> s.startsWith("a"))
                //.forEach(System.out::println);
                .collect(Collectors.toList());

        res.forEach(System.out::println);

    }

    private static void sortExample() {
        System.out.format("%nSorted%n------%n");
        // sort string starts with 'a' and print
//        List<String> res = new ArrayList<>();
//        for (String item : stringCollection) {
//            if (item.startsWith("a")) {
//                res.add(item);
//            }
//        }
//        res.sort((a, b) -> a.compareTo(b));
//        for (String item : res) {
//            System.out.println("item = " + item);
//        }
        stringCollection.stream()
                .filter(s -> s.startsWith("a"))
                .sorted(String::compareTo)
                .forEach(System.out::println);

    }


    private static List<Integer> mapExample() {
        System.out.format("%nMap%n---%n");
        // find string length 4 chars, get last char, convert to int, get list
//        List<Integer> intCollection = new ArrayList<>();
//
//        for (String item : stringCollection) {
//            if (item.length() == 4) {
//                intCollection.add(Integer.valueOf(item.substring(3)));
//            }
//        }
//
//        return null;
        //========================================
//         stringCollection.stream()
//                .filter(s -> s.length()==4)
//                .map(new Function<String, Integer>() {
//
//                    @Override
//                    public Integer apply(String s) {
//                        return Integer.valueOf(s.substring(3));
//                    }
//                })
//                .forEach(System.out::println);
        //==============================================
        List<Integer> integerCollection = stringCollection.stream()
                .filter(s -> s.length() == 4)
                .map(s -> Integer.valueOf(s.substring(3)))
                .collect(Collectors.toList());
        // System.out.println(integerCollection);
        integerCollection.forEach(System.out::println);

        return integerCollection;
    }

    private static void distinctExample(List<? extends Integer> intCollection) {
        System.out.format("%nDistinct%n--------%n");
//        List<Integer> distinctList = new ArrayList<>();
//        for (Integer item : intCollection) {
//            if (!distinctList.contains(item)) {
//                distinctList.add(item);
//            }
//        }
        List<Integer> integers = intCollection.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        integers.forEach(System.out::println);


    }

    private static void matchExample() {
        System.out.format("%nMatch%n-----%n");

//        boolean isAllWordStartA = false;
//        boolean isNoneWordStartA = false;
//        boolean isAnyWordStartA =false;

//        for (String item : stringCollection) {
//            if (item.startsWith("a")) {
//                isAnyWordStartA = true;
//                break;
//            }
//        }
//        System.out.println("isAnyWordStartA: " + isAnyWordStartA);
//
//
//        for (String item : stringCollection) {
//            if (!item.startsWith("a")) {
//                isAllWordStartA = false;
//                break;
//            }
//        }
//        System.out.println("isAllWordStartA: " + isAllWordStartA);
//
//
//        System.out.println("isNoneWordStartA: " + isNoneWordStartA);
//=========================================
        boolean isAllWordStartA = stringCollection.stream()
                .allMatch(s -> s.startsWith("a"));
        boolean isNoneWordStartA = stringCollection.stream()
                .noneMatch(s -> s.startsWith("a"));
        boolean isAnyWordStartA = stringCollection.stream()
                .anyMatch(s -> s.startsWith("a"));

        System.out.println(isAnyWordStartA);
        System.out.println(isAllWordStartA);
        System.out.println(isNoneWordStartA);
    }


    private static void minMaxExample(List<Integer> intCollection) {
        System.out.format("%nMin/Max%n-------%n");

//        Integer maxInt = intCollection.get(0);
//        for(Integer item: intCollection) {
//            if(Integer.compare(item, maxInt) > 0) {
//                maxInt = item;
//            }
//        }
//
//        System.out.println("max: " + maxInt);
//
//        Integer minInt = intCollection.get(0);
//        for(Integer item: intCollection) {
//            if(Integer.compare(item, minInt) < 0) {
//                minInt = item;
//            }
//        }
//
//       System.out.println("min: " + minInt);

        //Первый
        Optional<Integer> optional = Optional.of(1);
        Integer maxInt = intCollection.stream()
                //.max(Integer::compareTo)
                .max((a, b) -> a.compareTo(b))
                .get();
        //Второй
        Optional<Integer> optMaxInt = intCollection.stream()
                .max((a, b) -> a.compareTo(b));

        Integer maxInt1 = 0;

        if (optMaxInt.isPresent()) {
            maxInt1 = optMaxInt.get();
        }

        //Третий
        Integer maxInt2 = optMaxInt.orElse(0);
        System.out.println(maxInt2);

        Integer minInt = intCollection.stream()
                //.mapToInt(Integer::valueOf)
                .min((a, b) -> a.compareTo(b))
                .orElse(0);
        System.out.println("Минимальное = " + minInt);


        System.out.println("максимальный элемент" + maxInt);
    }

    private static void countExample(List<Integer> intCollection) {
        System.out.format("%nCount%n-----%n");
        // count only even number
        int countEven = 0;
//        for (Integer item : intCollection) {
//            if (item % 2 == 0) {
//                countEven++;
//            }
//        }
//
//        System.out.println("count: " + countEven);
        countEven = (int) intCollection.stream()
                .filter(x -> x % 2 == 0)
                .count();
        System.out.println("countEven = " + countEven);
    }

    private static void averageExample(List<Integer> intCollection) {
        System.out.format("%nAverage%n-------%n");
//        double average = 0;
//        for(Integer item: intCollection) {
//            average += item;
//        }
//        average /= intCollection.size();
//
// System.out.println("average = " + average);


        IntSummaryStatistics intSummaryStatistics = intCollection.stream()
                .mapToInt(Integer::valueOf)
                .summaryStatistics();//сщдержит всю иформацию которая нужна для этой коллекции

        System.out.println("intSummaryStatistics Average = " + intSummaryStatistics.getAverage());
        System.out.println("intSummaryStatistics Sum = " + intSummaryStatistics.getSum());
        System.out.println("intSummaryStatistics MAX= " + intSummaryStatistics.getMax());


    }

    private static void reduceExample(List<Integer> intCollection) {
        System.out.format("%nReduce%n-------%n");
//        int sum = 0;
//        for(Integer item: intCollection) {
//            sum = sum + item;
//        }
//        System.out.println("sum: " + sum);

        int sum = intCollection.stream()
                //.reduce(0, (a, b) -> a + b);
                .reduce((a, b) -> a + b)
                .get();


        System.out.println("sum = " + sum);
    }

    public static void main(String[] args) {

        //directStream();

        collectionStream();

        // --- Intermediate operations ---
        // Filter
        filterExample();

        // Sorted
        sortExample();

        // Map
        List<Integer> intCollection = mapExample();

        // Distinct
        distinctExample(intCollection);

        // --- Terminal operations ---
        // Match
        matchExample();

        // Max, Min
        minMaxExample(intCollection);

        // Count
        countExample(intCollection);

        // Average	(terminal operation)
        averageExample(intCollection);

        // Reduce (terminal operation)
        reduceExample(intCollection);

        // Parallel Streams
        parallelStreamsExample();
    }

    private static void parallelStreamsExample() {
        int max = 300_000;

        List<String> values = new ArrayList<>(max);

        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        System.out.format("%nSequence%n-------%n");

        List<String> cpy = new ArrayList<>(values);
        //Instant start;
        //Instant end;
        LocalTime start = LocalTime.now();
        //start = Instant.now();
        cpy.stream()
                .sorted()
                .count();
        //end = Instant.now();
        LocalTime end = LocalTime.now();
        //long seq = Duration.between(start, end).getNano();
        System.out.println(end.getNano() - start.getNano());

       // System.out.println("seq: " + seq);

        System.out.format("%nParallel%n-------%n");
       // start = Instant.now();
        LocalTime start1 = LocalTime.now();
        values.parallelStream()
                .sorted()
                .count();
        //end = Instant.now();
        LocalTime end1 = LocalTime.now();
        System.out.println(end1.getNano() - start1.getNano());
        //long par = Duration.between(start, end).getNano();
//        System.out.println("\npar: " + par);
//        System.out.println("seq/par: " + ((double) seq / par));
    }
}

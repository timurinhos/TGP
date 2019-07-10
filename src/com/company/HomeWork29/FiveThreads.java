package com.company.HomeWork29;
//Напишите класс, реализующий интерфейс Runnable, содержащий поле-счетчик. Метод run() должен наращивать этот счетчик. Создайте пять экземпляров этого класса и запустите их в пяти потоках с разными приоритетами. После 3 секунд работы остановите потоки и сравните значения счетчиков.

import static java.lang.Thread.sleep;

public class FiveThreads {

    static class Counter implements Runnable {

        private int count;
        Thread thread;

        public Counter(Thread thread) {

            this.thread = thread;
            thread.start();
        }

        @Override
        public void run() {

            while (thread.isAlive()) {
                count++;
            }

            System.out.println(thread.getName() + " поток" + ", приоритет  " + thread.getPriority() + ", счетчик: " + count);

        }

    }

    public static void main(String[] args) {

        Thread thread1 = new Thread( "Первый");
        thread1.setPriority(2);

        Thread thread2 = new Thread(() -> System.out.println("--------------"), "Второй");
        thread2.setPriority(4);

        Thread thread3 = new Thread(() -> System.out.println("--------------"), "Третий");
        thread3.setPriority(3);

        Thread thread4 = new Thread(() -> System.out.println("--------------"), "Четвертый");
        thread4.setPriority(5);

        Thread thread5 = new Thread(() -> System.out.println("--------------"), "Пятый");
        thread5.setPriority(1);

        System.out.println("Идет выполнения потоков...\n");

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Выполнения потоков прекращено!");

        Counter counter1 = new Counter(thread1);
        counter1.run();
        Counter counter2 = new Counter(thread2);
        counter2.run();
        Counter counter3 = new Counter(thread3);
        counter3.run();
        Counter counter4 = new Counter(thread4);
        counter4.run();
        Counter counter5 = new Counter(thread5);
        counter5.run();

    }
}

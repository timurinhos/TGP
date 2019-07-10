package com.company.HomeWork30;
//Напишите класс, реализующий интерфейс Runnable, метод run() которого считывает из файла на жестком диске и выводит в указанный поток какие-либо данные.
//Для вывода каждой "порции" данных должно использоваться несколько операций вывода. Операции вывода должны быть разделены вызовами sleep(100).
//Запустите 10 экземпляров этого класса в разных потоках так, чтобы они выводили данные в один и тот же поток вывода. Вывод информации должен быть синхронизирован так, чтобы в результирующем выходном потоке порции данных не "перемешивались". Осуществите запись данных из общего потока в отдельный файл на жестком диске (или в самом проекте, как мы делали).

import java.io.*;
import static java.lang.Thread.sleep;

public class ReadFile implements Runnable {

    private Thread thread;

    public ReadFile(Thread thread) {
        this.thread = thread;
        thread.start();
    }

    @Override
    public void run() {

        FileReader fr = null;
        try {
            fr = new FileReader("text.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int count = 0;
        while (line != null) {
            String[] parts = line.split(" ");
            for (String w : parts) {
                count++;
            }
            try {
                line = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Количество слов:");
        System.out.println(count);

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int i = 0;
        BufferedReader bufferedReader;
        try {
            FileReader fileReader = new FileReader("text.txt");
            bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.readLine() != null)
                i++;
            System.out.println("Количество строк:\n" + i + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

class ThreadsTest {

    public static void main(String[] args) {

        Thread thread1 = new Thread();
        Thread thread2 = new Thread(() -> System.out.println("============="));
        Thread thread3 = new Thread(() -> System.out.println("============="));
        Thread thread4 = new Thread(() -> System.out.println("============="));
        Thread thread5 = new Thread(() -> System.out.println("============="));
        Thread thread6 = new Thread(() -> System.out.println("============="));
        Thread thread7 = new Thread(() -> System.out.println("============="));
        Thread thread8 = new Thread(() -> System.out.println("============="));
        Thread thread9 = new Thread(() -> System.out.println("============="));
        Thread thread10 = new Thread(() -> System.out.println("============="));

        ReadFile readFile1 = new ReadFile(thread1);
        readFile1.run();
        ReadFile readFile2 = new ReadFile(thread2);
        readFile2.run();
        ReadFile readFile3 = new ReadFile(thread3);
        readFile3.run();
        ReadFile readFile4 = new ReadFile(thread4);
        readFile4.run();
        ReadFile readFile5 = new ReadFile(thread5);
        readFile5.run();
        ReadFile readFile6 = new ReadFile(thread6);
        readFile6.run();
        ReadFile readFile7 = new ReadFile(thread7);
        readFile7.run();
        ReadFile readFile8 = new ReadFile(thread8);
        readFile8.run();
        ReadFile readFile9 = new ReadFile(thread9);
        readFile9.run();
        ReadFile readFile10 = new ReadFile(thread10);
        readFile10.run();

    }
}

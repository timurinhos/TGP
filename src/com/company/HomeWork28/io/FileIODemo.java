package com.company.HomeWork28.io;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIODemo {
    public static void main(String[] args) throws IOException {

//        //separator windows: \
//        //separator unix: /
//        Path pathToFile = Paths.get("file.txt");
//        //файл в текущей директории
//        System.out.println("pathToFile = " + pathToFile);
//        //возвращает абсолютныйц путь
//        System.out.println("AbsolutePath = " + pathToFile.toAbsolutePath());
//        System.out.println("AbsolutePath = " + pathToFile.toRealPath());
//
//
//
//        // File, Files, Paths
//        File file = new File("new_file.txt");
//        if (!file.exists()) {
//            if (file.createNewFile()) {
//
//            }
//        }
//       // Checking a file or directory
//
//        System.out.println(Files.isDirectory(pathToFile));
//        System.out.println(Files.isDirectory(pathToFile));

        inOutStream();

        byteArray();

        streamURL();

        bufferedInput();

        charracterIO();

    }

    private static void charracterIO() {
        try (Reader reader = new FileReader("text.txt"); BufferedReader br = new BufferedReader(reader, 256)){
         char[] buff = new char[256];
          int count = reader.read(buff);
           System.out.println("Reader  = " + new String(buff, 0, count));


        String str = br.readLine();

        System.out.println("str = " + str);


        Writer writer = new FileWriter("text.txt");
        writer.write("using writer");
        writer.close();




    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    private static void bufferedInput() {

        try (BufferedInputStream in = new BufferedInputStream(
                new FileInputStream("text.txt"), 1024)) {
            byte[] buff = new byte[256];
           if(in.markSupported()) {

               in.read(buff);
               System.out.println("new String(buff) = " + new String(buff));
               in.mark(100);
               in.read(buff);
               System.out.println("new String(buff) = " + new String(buff));
               in.reset();
               in.read(buff);
               System.out.println("new String(buff) = " + new String(buff));

           }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }


    }

    private static void streamURL() {
        try {
            InputStream in = new URL("https://itstep.dp.ua").openStream();
            OutputStream out = new FileOutputStream("index.html");

            byte[] buff = new byte[1024];
            int count = 0;
            while ((count = in.read(buff))!=-1){
                out.write(buff, 0 , count);
            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        private static void byteArray() {

        InputStream in = new ByteArrayInputStream(new byte[]{45, 12, 34});
    }

    private static void inOutStream() {
//        OutputStream out = null;
//        try {
//            out = new FileOutputStream("text.txt");
//            String text = "Hello it is a new text";
//            out.write(text.getBytes());
        try (OutputStream out = new FileOutputStream("text.txt");) {

            String text = "Hello it is a new text";
            out.write(text.getBytes());

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {

            e.printStackTrace();
//        } finally {
//            if (out != null) {
//                try {
//                    out.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
        }

        InputStream stream = null;
        try {
            stream = new FileInputStream("text.txt");
            byte[] buff = new byte[256];
            int count;
            //stream.skip(5);
            while ((count = stream.read(buff)) != -1) {
                String text = new String(buff, 0, count, StandardCharsets.UTF_8);
                System.out.println("text = " + text);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

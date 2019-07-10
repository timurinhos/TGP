package com.company.HomeWork14;
//Дан текст, который содержит различные английские буквы и знаки препинания. Вам необходимо найти самую частую букву в тексте. Результатом должна быть буква в нижнем регистре.
//При поиске самой частой буквы, регистр не имеет значения, так что при подсчете считайте, что "A" == "a".
//Убедитесь, что вы не считайте знаки препинания, цифры и пробелы, а только буквы.
//Если в тексте две и больше буквы с одинаковой частотой, тогда результатом будет буква, которая идет первой в алфавите.
import java.util.Scanner;
public class SymbolsSearch {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текс на английском: ");
        String str1 = scan.nextLine();

        String u = str1.toUpperCase();
        String l = str1.toLowerCase();
        u = l;

        MaxSymbols(u);

        }

        static void MaxSymbols(String u){

            char c = 'a';

            for (int i = 0; i < u.length(); i++) {
                if (u.charAt(i) >= 'a' && u.charAt(i) <= 'z') {
                    c = u.charAt(i);
                }
            }

            System.out.println("Символ который встречается найбольшее количество раз это: " + c);
    }
}



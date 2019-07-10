package com.company.HomeWork28;
//Написать программу для подсчета наиболее встречающихся слов в неком тексте произведения Алиса в стране чудес.
//Файл с текстом прилагается.
//При выводе результатов привести первые 10 наиболее встречающихся слова с указанием их количества.
//
//Пример вывода:
//
//алиса: 406
//сказала: 126
//было: 105
//сказал: 100
//если: 87
//только: 87
//очень: 71
//когда: 64
//король: 61
//подумала: 61
//
//Подсчет слов не должен учитывать регистр и знаки препинания.
//Вывести 10 наиболее часто встречающихся слов (это, и, а, на…такие слова не считать). Файл с текстом прилагается.

import java.io.File;
import java.util.*;

public class FindWords {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("alice.txt"));
        Map<String, Integer> map = new HashMap<String, Integer>();
        while (scanner.hasNext()) {

            final String regex = "[_\\.,:;\"\'\\)\\(\\?\\!\\-\\>\\<]";
            final String regex1 = "[а-яА-Я]{4,}";

            String word = scanner.next().replaceAll(regex, "").toLowerCase();
            if (word.matches(regex1)) {
                if (!map.containsKey(word)) {
                    map.put(word, 1);
                } else {
                    map.put(word, map.get(word) + 1);
                }
            }
        }

        List<Map.Entry<String, Integer>> words = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        words.sort(new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return a.getValue().compareTo(b.getValue());
            }
        });

        for (int i = 0; i < 10; i++) {

            System.out.println(words.get(words.size() - i - 1).getKey() + ": " + words.get(words.size() - i - 1).getValue());

        }

    }

}

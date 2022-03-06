package com.company.course02.homework06;

import java.util.*;

/**
 * Напишите код, который выводит в консоль все НЕ уникальные слова из списка слов (в нём могут встречаться дубли).
 *
 * В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.
 *
 * Код должен работать с любой последовательностью и объемом списка слов.
 */
public class Task04 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(List.of(
                "a",
                "aa",
                "1aaa",
                "1aaa",
                "aaaa",
                "aaaaa",
                "1aaaaaa",
                "1aaaaaa",
                "aaaaaaa",
                "1aaaaaaaa",
                "1aaaaaaaa"
        ));

        System.out.println("------------- Выводим всё не уникальные слова.");
        print(stringList);
    }

    private static void print(List<String> stringList) {
        Set<String> duplicates = new LinkedHashSet<>();
        Set<String> uniques = new HashSet<>();

        for (String string : stringList) {
            if (!uniques.add(string)) {
                duplicates.add(string);
            }
        }

        System.out.println(duplicates);
    }
}

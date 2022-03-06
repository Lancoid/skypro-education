package com.company.course02.homework06;

import java.util.*;

/**
 * Напишите код, который выводит в консоль все количество дублей из списка слов.
 *
 * *
 * Например, у вас есть текст из 6 слов, в котором есть одно слово, которое повторяется.
 * В таком случае в консоли выведется результат "2", то есть то количество элементов, которые повторяются.
 * *
 *
 * В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.
 * Код должен работать с любой последовательностью и объемом списка слов.
 */
public class Task04 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(List.of(
                "a",
                "aa",
                "aaa",
                "aaaa",
                "aaaaa",
                "aaaaaa",
                "aaaaaaa",
                "aaaaaaaa",
                "aaaaaaaa"
        ));

        System.out.println("------------- Выводим всё не уникальные слова.");
        print(stringList);
    }

    private static void print(List<String> stringList) {
        Set<String> uniques = new HashSet<>(stringList);

        int result = 0;

        for (String string : uniques) {
            int frequency = Collections.frequency(stringList, string);

            if (frequency > 1) {
                result += frequency;
            }
        }

        System.out.println(result);
    }
}

package com.company.course05.homework02;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Дан массив строк, необходимо удалить из него все дубли, оставшиеся строки объединить в одну в порядке следования в массиве.
 */
public class Task01 {
    public static void main(String[] args) {
        String expectedString = "тысячадевятьсотсемидисетяшестисантиметровый";

        String[] array = {
                "тысяча", "девятьсот", "семидисетя", "шести", "санти", "метровый",
                "тысяча", "девятьсот", "семидисетя", "шести", "санти",
                "тысяча", "девятьсот", "семидисетя", "шести",
                "тысяча", "девятьсот", "семидисетя",
                "тысяча", "девятьсот",
                "тысяча",
        };

        String result = Arrays.stream(array).distinct().collect(Collectors.joining());

        System.out.println(result.equals(expectedString));
    }

}

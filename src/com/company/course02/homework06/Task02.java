package com.company.course02.homework06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
 *
 * Код должен работать с любой последовательностью и объемом списка чисел.
 */
public class Task02 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        System.out.println("------------- Выводим чётные в порядке возрастания.");
        print(numbers, true);

        System.out.println("------------- Выводим нечётные в порядке возрастания.");
        print(numbers, false);
    }

    private static void print(List<Integer> numbers, boolean inEven) {
        List<Integer> temporary = new ArrayList<>();

        for (Integer number : numbers) {
            if (number != null && (number % 2 == 0) == inEven && !temporary.contains(number)) {
                temporary.add(number);
            }
        }

        Collections.sort(temporary);

        System.out.println(temporary);
    }
}

package com.company.course02.homework06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        Set<Integer> temporary = new HashSet<>(Set.copyOf(numbers));

        if (inEven) {
            temporary.removeIf(number -> number % 2 != 0);
        } else {
            temporary.removeIf(number -> number % 2 == 0);
        }

        System.out.println(temporary);
    }
}

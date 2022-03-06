package com.company.course02.homework06;

import java.util.ArrayList;
import java.util.List;

/**
 * Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
 * Код должен работать с любой последовательностью и объемом списка чисел.
 */
public class Task01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        System.out.println("------------- Выводим чётные");
        print(numbers, true);

        System.out.println("------------- Выводим нечётные");
        print(numbers, false);
    }

    private static void print(List<Integer> numbers, boolean inEven) {
        for (Integer number : numbers) {
            if (number != null && (number % 2 == 0) == inEven) {
                System.out.println(number);
            }
        }
    }
}

package com.company.courseOne.homework6;

import java.util.Arrays;

/**
 * Решите предыдущее задание, но без использования дополнительного массива.
 * Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
 * Выведите результат программы в консоль тем же способом.
 *
 * Уточнения:
 * * Это задание не на сортировку.
 * * Не использовать Arrays.sort() и другие способы сортировок.
 * * Числа в порядке убывания даны исключительно для указания направления чтения.
 * * Массив может быть 5 8 2 3 9, нужно из него сделать 9 3 2 8 5.
 */
public class Task07 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 2, 3, 9};

        System.out.println(Arrays.toString(array));

        int arrayMiddle = array.length / 2;
        int temporaryNumber;

        for (int counter = 0; counter < arrayMiddle; counter++) {
            temporaryNumber = array[counter];

            array[counter] = array[array.length - 1 - counter];
            array[array.length - 1 - counter] = temporaryNumber;
        }

        System.out.println(Arrays.toString(array));
    }
}

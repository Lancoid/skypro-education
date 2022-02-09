package com.company.course01.homework06;

import java.util.Arrays;

/**
 * У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
 *
 * Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
 *
 * Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
 *
 * Нам дан массив чисел: {5, 4, 3, 2, 1}
 * Необходимо привести его к виду: {1, 2, 3, 4, 5}
 *
 * Решите задачу с использованием дополнительного массива.
 * Напечатайте массив до преобразования и после
 */
public class Task06 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(array));

        int[] temporaryArray = array.clone();

        for (int counter = 0; counter < temporaryArray.length; counter++) {
            array[counter] = temporaryArray[temporaryArray.length - 1 - counter];
        }

        System.out.println(Arrays.toString(array));
    }
}

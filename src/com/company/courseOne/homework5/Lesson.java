package com.company.courseOne.homework5;

/**
 * Массивы ч.1
 */
@SuppressWarnings("ForLoopReplaceableByForEach")
public class Lesson
{
    public static void main(String[] args)
    {
        /*
         * Перебор массивов
         */

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int number : array) {
            System.out.println(number);
        }
    }
}

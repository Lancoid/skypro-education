package com.company.courseOne.homework08;

import java.util.Arrays;

/**
 * Напишите метод, который получает на вход массив и переставляет все его элементы в обратном порядке.
 *
 * Подобное задание вы решали в домашнем задании по массивам.
 * @see com.company.courseOne.homework06.Task07
 *
 * В метод приходит массив, допустим: {3, 2, 1, 6, 5}.
 *
 * Нужно без вспомогательного массива переместить элементы так, чтобы поданный массив стал: {5, 6, 1, 2, 3}.
 *
 * Рекомендуем написать этот метод без возвращаемого значения.
 * Вы будете приятно удивлены, что даже если мы не вернем массив, первоначальный массив изменится,
 * когда мы будем модернизировать пришедший в виде параметра массив внутри метода.
 */
@SuppressWarnings("DuplicatedCode")
public class Task05 {
    public static void main(String[] args) {
        int[] integerArray = {3, 2, 1, 6, 5};

        System.out.println("До преобразования" + Arrays.toString(integerArray));

        reverseArray(integerArray);

        System.out.println("После преобразования" + Arrays.toString(integerArray));
    }

    private static void reverseArray(int[] array) {
        int arrayMiddle = array.length / 2;
        int temporaryNumber;

        for (int counter = 0; counter < arrayMiddle; counter++) {
            temporaryNumber = array[counter];

            array[counter] = array[array.length - 1 - counter];
            array[array.length - 1 - counter] = temporaryNumber;
        }
    }
}

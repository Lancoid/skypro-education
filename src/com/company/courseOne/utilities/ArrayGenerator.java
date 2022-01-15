package com.company.courseOne.utilities;

import java.util.Random;

public class ArrayGenerator {
    public static int[] getIntegerArray() {
        return new int[]{1, 2, 3};
    }

    public static float[] getFloatArray() {
        return new float[]{1.57f, 7.654f, 9.986f};
    }

    public static String[] getStringArray() {
        String[] result = new String[4];

        result[0] = "first_key_value";
        result[1] = "second_key_value";
        result[2] = "third_key_value";

        return result;
    }

    /**
     * Представим, что вы работаете в небольшой компании.
     *
     * К вам часто обращаются коллеги из других отделов, чтобы вы помогли им настроить их работу.
     * И вот к вам приходят коллеги из бухгалтерии и просят помощи с корпоративной бухгалтерской книгой.
     *
     * Каждый день месяца, включая выходные, компания тратит средства — некую сумму,
     * причем в бухгалтерской книге хранится сумма затрат по дням (а не каждая сумма отдельно).
     * То есть в книге 30 записей разных сумм. Эти суммы разнятся от 100 000 до 200 000.
     *
     * Ваш коллега по отделу написал код, который генерирует массив из 30 случайных чисел,
     * и предложил прежде, чем писать программу для настоящей бухгалтерской книги,
     * проверить всё на случайных числах от 100 000 до 200 000.
     *
     * Для получения массива случайных чисел достаточно объявить массив и вызвать указанный ранее метод.
     * Метод инициализирует ваш массив и заполнит его случайными значениями от 100_000 до 200_000.
     */
    public static int[] generateRandomNumbers(int arrayLength, int minimumRangeValue, int maximumRangeValue) {
        if (minimumRangeValue >= maximumRangeValue) {
            throw new RuntimeException("Incorrect minimumRangeValue variable.");
        }

        Random random = new Random();

        int[] randomNumbersArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            randomNumbersArray[i] = random.nextInt(maximumRangeValue - minimumRangeValue) + minimumRangeValue;
        }

        return randomNumbersArray;
    }
}

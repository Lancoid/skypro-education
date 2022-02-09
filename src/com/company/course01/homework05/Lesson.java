package com.company.course01.homework05;

import java.util.Arrays;

/**
 * Массивы ч.1
 */
@SuppressWarnings("unused")
public class Lesson {
    public static void main(String[] args) {
        /*
         * 💡 Массив — упорядоченная структура данных фиксированного размера.
         *
         * Мы можем влиять на тип данных и размер только на стадии создания массива.
         * Массив может хранить в себе данные исключительно того типа, которым он инициализирован.
         * Массив является объектом.
         */

        /* 💡 Создание массива -------------------------------------------------------------------------------------------------------------------- */

        char[] charArray = new char[15];
        int[] integerArray = new int[5];
        double[] doubleArray = new double[10];
        long[] longArray = new long[82];
        float[] floatArray = new float[23];
        boolean[] booleanArray = new boolean[2];

        /* 💡 Работа с массивами. ------------------------------------------------------------------------------------------------------------------ */

        /* Нумерация ключей массива начинается с ноля */
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;
        integerArray[3] = 4;
        integerArray[4] = 5;

        /* Получить элемент из ячейки по известному нам ключу */
        int arrayValue = integerArray[4];
        System.out.println(arrayValue); // В ответе будут 5

        /*
         * Так как массивы начинаются с нуля,
         * 💡 значение arr.length всегда будет иметь индекс последнего элемента + 1.
         * Т. е. последний элемент лежит по индексу (номеру) в ячейке 4, а length хранит в себе 5.
         */

        int arrayLength = integerArray.length;  // Узнали размер массива
        System.out.println(arrayLength);        // В ответе будет 5

        /* Вывод массива в консоль */
        System.out.println(Arrays.toString(integerArray));
    }
}

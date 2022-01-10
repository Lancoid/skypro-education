package com.company.courseOne.homework5;

import java.util.Arrays;

/**
 * Объявите три массива:
 * 1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
 * 2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 – сразу заполнив его значениями.
 * 3. Произвольный массив – тип и количество данных определите сами.
 * Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
 */
public class Task1 extends Task0
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(getIntegerArray()));

        System.out.println(Arrays.toString(getFloatArray()));

        System.out.println(Arrays.toString(getStringArray()));
    }
}

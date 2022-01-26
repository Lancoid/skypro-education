package com.company.courseOne.homework06;

import com.company.courseOne.utilities.ArrayGenerator;

/**
 * А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
 *
 * Нужно написать программу, которая посчитает среднее значение трат за месяц
 * (то есть сумму всех трат за месяц поделить на количество дней),
 * и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
 */
public class Task03 {
    public static void main(String[] args) {
        int[] randomNumbersArray = ArrayGenerator.generateRandomNumbers(30, 100_000, 200_000);

        int totalSum = 0;

        for (int number : randomNumbersArray) {
            totalSum += number;
        }

        System.out.println("Средняя сумма трат за месяц составила " + (totalSum / randomNumbersArray.length) + " рублей");

    }
}

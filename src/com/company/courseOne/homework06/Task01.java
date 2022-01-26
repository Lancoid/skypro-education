package com.company.courseOne.homework06;

import com.company.courseOne.utilities.ArrayGenerator;

/**
 * Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
 *
 * Нужно написать программу, которая решит эту задачу,
 * и вывести в консоль результат в формате: «Сумма трат за месяц составила … рублей».
 */
public class Task01 {
    public static void main(String[] args) {
        int[] randomNumbersArray = ArrayGenerator.generateRandomNumbers(30, 100_000, 200_000);

        int totalSum = 0;

        for (int number : randomNumbersArray) {
            totalSum += number;
        }

        System.out.println("Сумма трат за месяц составила " + totalSum + " рублей");
    }
}

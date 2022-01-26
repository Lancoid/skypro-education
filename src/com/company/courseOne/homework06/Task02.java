package com.company.courseOne.homework06;

import com.company.courseOne.utilities.ArrayGenerator;

/**
 * Следующая задача — найти минимальную и максимальную трату за день.
 *
 * Нужно написать программу, которая решит эту задачу,
 * и вывести в консоль результат в формате:
 * «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
 */
public class Task02 {
    public static void main(String[] args) {
        int[] randomNumbersArray = ArrayGenerator.generateRandomNumbers(30, 100_000, 200_000);

        int minimumExpensesPerDay = 0;
        int maximumExpensesPerDay = 0;

        for (int number : randomNumbersArray) {
            if (number > maximumExpensesPerDay || maximumExpensesPerDay == 0) {
                maximumExpensesPerDay = number;
            }

            if (number < minimumExpensesPerDay || minimumExpensesPerDay == 0) {
                minimumExpensesPerDay = number;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + minimumExpensesPerDay + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maximumExpensesPerDay + " рублей");
    }
}

package com.company.courseOne.homework8;

import com.company.courseOne.utilities.ArrayGenerator;

/**
 * Снова вспоминаем домашнее задание по массивам.
 * В нем была задача, которая требовала высчитать среднюю выплату за день.
 *
 * @see com.company.courseOne.homework6.Task03
 *
 * Был дан сгенерированный массив из 30 значений от 100 до 200 тысяч, для его генерации допускается использовать метод из прошлого домашнего задания.
 *
 * Нужно сгенерировать массив, подать его в наш метод,
 * а внутри метода подсчитать сумму элементов и вычислить среднее значение, которое нужно вернуть из метода в виде результата.
 *
 * Сложность в том, что метод нужно не просто написать, но еще и декомпозировать.
 * То есть для работы этого метода нужно будет создать еще методы (1 или более),
 * которые его будут обслуживать и вычислять промежуточные результаты.
 * Среднее значение нужно вычислять в дробном виде, так как результат должен быть точным.
 */
public class Task06 {
    public static void main(String[] args) {
        int[] randomNumbersArray = ArrayGenerator.generateRandomNumbers(30, 100_000, 200_000);
        float averageExpensesPerDay = getAverageExpensesPerDay(randomNumbersArray);

        System.out.println("Средняя сумма трат за месяц составила " + averageExpensesPerDay + " рублей");
    }

    private static float getAverageExpensesPerDay(int[] array) {
        int totalSum = getTotalSumByDays(array);
        int days = array.length;

        return (float) totalSum / days;
    }

    private static int getTotalSumByDays(int[] array) {
        int totalSum = 0;

        for (int number : array) {
            totalSum += number;
        }

        return totalSum;
    }
}

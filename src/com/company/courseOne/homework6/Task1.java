package com.company.courseOne.homework6;

/**
 * Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
 *
 * Нужно написать программу, которая решит эту задачу,
 * и вывести в консоль результат в формате: «Сумма трат за месяц составила … рублей».
 */
public class Task1 extends Task0
{
    public static void main(String[] args)
    {
        generateRandomNumbersArray();

        int totalSum = 0;

        for (int number : randomNumbersArray) {
            totalSum += number;
        }

        System.out.println("Сумма трат за месяц составила " + totalSum + " рублей");

    }
}

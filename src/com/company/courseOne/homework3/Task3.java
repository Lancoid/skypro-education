package com.company.courseOne.homework3;

/**
 * Напишите программу, которая определяет, является ли год високосным или нет.
 *
 * Переменную года назовите year, в которую можно подставить значение интересующего нас года. Например, 2021.
 * Программа должна определять, високосный год или нет, и выводить соответствующее сообщение:
 * «... год является високосным» или «... год не является високосным».
 *
 * Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый. Также високосным является каждый четырехсотый год.
 */
public class Task3
{
    public static void main(String[] args)
    {
        int year = 2021;

        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        System.out.println(year + " год " + (isLeapYear ? "является" : " не является") + " високосным");
    }
}

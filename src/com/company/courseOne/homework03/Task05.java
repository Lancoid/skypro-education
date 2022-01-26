package com.company.courseOne.homework03;

/**
 * Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит.
 * Например, 1 месяц (он же январь) принадлежит к сезону зима.
 *
 * Для написания программы используйте оператор switch.
 * Для обозначения номера месяца используйте переменную monthNumber = 12.
 * Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).
 */
public class Task05 {
    public static void main(String[] args) {
        int monthNumber = 1;

        System.out.println(getSeasonName(monthNumber));
    }

    private static String getSeasonName(int monthNumber) {
        return switch (monthNumber) {
            case 12, 1, 2 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> "Не правильное значение для определения сезона";
        };
    }
}

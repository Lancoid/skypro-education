package com.company.courseOne.homework7;

/**
 * Система, в которой мы работаем, не принимает символ “ё”.
 *
 * Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
 *
 * В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
 */
public class Task04 {
    public static void main(String[] args) {
        String fullName = "Иванов Семён Семёнович";

        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullName.replace("ё", "е"));
    }
}

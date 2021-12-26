package com.company.courseOne.homework2;

/*
 * Объявите целочисленные переменные a = 12, b = 27, c = 44, d = 15, e = 9.
 * Вычислите выражение a * (b + (c - d * e)) и присвойте его результат переменной result.
 * Инвертируйте результат (значение в переменной result),
 * преобразовав его в вариант с противоположным значением (отрицательное -> положительное, положительное -> отрицательное).
 *
 * Выведите (напечатайте) результат в консоль.
 */
public class Task6
{
    public static void main(String[] args)
    {
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;

        int result = -(a * (b + (c - d * e)));

        System.out.println(result);
    }
}

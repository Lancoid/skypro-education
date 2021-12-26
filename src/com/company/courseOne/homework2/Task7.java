package com.company.courseOne.homework2;

/*
 * Объявите целочисленные переменные a = 5 и b = 7.
 * С помощью математических манипуляций добейтесь того, чтобы a = 7 и b = 5.
 *
 * Использовать дополнительные переменные или числа запрещено.
 */
public class Task7
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 7;

        System.out.println("Инициализированное a = " + a);
        System.out.println("Инициализированное b = " + b);

        System.out.println("Меняем переменные местами");

        a = a + b; // в `a` кладем сумму двух переменных
        b = a - b; // устанавливаем в `b` значение старой переменной `a` (сумма - `b`)
        a = a - b; // устанавливаем в `a` значение старой переменной `b` (сумма - (новое `b` == старое `a`))

        System.out.println("Теперь a = " + a);
        System.out.println("Теперь b = " + b);
    }
}

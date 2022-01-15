package com.company.courseOne.homework4;

/**
 * Мы решили написать астрономическое приложение, которое считает, когда над Землей пролетают кометы и их можно будет увидеть.
 * Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом с Землей каждый 79-й год, начиная с нулевого.
 *
 * Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет, и когда мы увидим ее в следующий раз.
 *
 * Условия задачи:
 * В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.
 * Для вычисления периода можно создать две дополнительные переменные,
 * которые содержат год за 200 лет до текущего (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.
 *
 * В результате решения задачи в консоль должен вывестись следующий результат:
 * 1896
 * 1975
 * 2054
 */
public class Task3 {
    public static void main(String[] args) {
        int currentYear = 2022;
        int cometPeriod = 79;
        int counterPeriodStart = currentYear - 200;
        int counterPeriodEnd = currentYear + 100;

        for (int counter = counterPeriodStart; counter < counterPeriodEnd; counter++) {
            if (counter % cometPeriod == 0) {
                System.out.println(counter);
            }
        }
    }
}

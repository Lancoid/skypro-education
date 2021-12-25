package com.company.courseOne.homework2;

/*
 * Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг, чтобы оставаться в своей весовой категории.
 * Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
 *
 * Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и сколько, если каждый день будет худеть на 500 грамм.
 * Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
 *
 * Результаты подсчетов выведите в консоль.
 */
public class Task4
{
    public static void main(String[] args)
    {
        int weightToLose = 7 * 1000;
        int minimumWeightToLosePerDay = 250;
        int maximumWeightToLosePerDay = 500;

        int maximumDays = weightToLose / minimumWeightToLosePerDay;
        int minimumDays = weightToLose / maximumWeightToLosePerDay;


        System.out.println("На похудение, если спортсмен будет терять каждый день по " + minimumWeightToLosePerDay + " грамм, уйдёт " + maximumDays + " день/дней.");
        System.out.println("На похудение, если спортсмен будет терять каждый день по " + maximumWeightToLosePerDay + " грамм, уйдёт " + minimumDays + " день/дней.");
        System.out.println("В среднем " + (maximumDays + minimumDays) / 2 + " день/дней.");
    }
}

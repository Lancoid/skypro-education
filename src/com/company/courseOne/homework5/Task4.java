package com.company.courseOne.homework5;

/**
 * Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
 *
 * Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
 *
 * Распечатайте результат преобразования в консоль.
 */
public class Task4 extends Task0 {
    public static void main(String[] args) {
        int[] integerArray = getIntegerArray();

        for (int counter = 0; counter < integerArray.length; counter++) {
            if (integerArray[counter] % 2 != 0) {
                integerArray[counter] += 1;
            }

            if (counter != 0) {
                System.out.print(",");
            }

            System.out.print(integerArray[counter]);
        }

        System.out.println();
    }
}

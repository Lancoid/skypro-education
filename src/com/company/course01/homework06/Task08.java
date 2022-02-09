package com.company.course01.homework06;

/**
 * Задача, которая используется/бывает/встречается на собеседованиях.
 * Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
 *
 * Необходимо найти два числа, сумма которых равна −2.
 * Напечатать эти числа в консоль.
 */
public class Task08 {
    public static void main(String[] args) {
        int[] array = new int[]{-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int firstNumber;
        int secondNumber;
        int sum = -2;

        for (int i = 0; i < array.length - 1; i++) {
            firstNumber = array[i];

            for (int j = i + 1; j < array.length; j++) {
                secondNumber = array[j];

                if (firstNumber + secondNumber == sum) {
                    System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
                    break;
                }
            }
        }
    }
}

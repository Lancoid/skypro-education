package com.company.courseOne.homework4;

/**
 * Вывести первые 10 чисел последовательности Фибоначчи.
 *
 * Последовательность строится по следующему правилу: каждое следующее число равняется сумме двух предыдущих.
 *
 * Дано: две целочисленные переменные, первая равна 0, вторая равна 1.
 * Эти два числа — первые числа последовательности. Следующие восемь нужно вычислить и вывести.
 * Должно получиться следующее: 0 1 1 2 3 5 8 13 21 34
 */
public class Task5
{
    public static void main(String[] args)
    {
        int firstNumber = 0;
        int secondNumber = 1;
        StringBuilder result = new StringBuilder();

        result.append(firstNumber).append(" ").append(secondNumber);

        int currentNumber = 1;

        for (int counter = 2; counter < 10; currentNumber++) {
            if (currentNumber == firstNumber + secondNumber) {
                result.append(" ").append(currentNumber);

                firstNumber = secondNumber;
                secondNumber = currentNumber;
                counter++;
            }
        }

        System.out.println(result);
    }
}

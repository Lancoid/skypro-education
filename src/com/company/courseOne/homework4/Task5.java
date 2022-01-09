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
        int counter = 2;

        System.out.print(firstNumber);
        System.out.print(" ");
        System.out.print(secondNumber);

        int currentNumber = 1;

        while (true) {
            if (currentNumber == firstNumber + secondNumber) {
                System.out.print(" ");
                System.out.print(currentNumber);

                firstNumber = secondNumber;
                secondNumber = currentNumber;
                counter++;
            }

            if (counter == 10) {
                break;
            }

            currentNumber++;
        }
    }
}

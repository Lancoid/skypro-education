package com.company.courseOne.homework5;

/**
 * Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента, через запятую.
 * Запятая между последним элементом одного массива и первым элементом следующего не нужна.
 */
public class Task2 extends Task0
{
    public static void main(String[] args)
    {
        /* *** Распечатка целочисленного массива в порядке от начала до конца *** */

        int[] integerArray = getIntegerArray();

        for (int counter = 0; counter < integerArray.length; counter++) {
            if (counter != 0) {
                System.out.print(",");
            }

            System.out.print(integerArray[counter]);
        }

        System.out.println();

        /* *** Распечатка массива чисел с плавающей точкой в порядке от начала до конца *** */

        float[] floatArray = getFloatArray();

        for (int counter = 0; counter < floatArray.length; counter++) {
            if (counter != 0) {
                System.out.print(",");
            }

            System.out.print(floatArray[counter]);
        }

        System.out.println();

        /* *** Распечатка строкового массива в порядке от начала до конца *** */

        String[] stringArray = getStringArray();

        for (int counter = 0; counter < stringArray.length; counter++) {
            if (counter != 0) {
                System.out.print(",");
            }

            System.out.print(stringArray[counter]);
        }

        System.out.println();
    }
}

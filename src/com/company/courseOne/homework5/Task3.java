package com.company.courseOne.homework5;

/**
 * Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива, а с последнего.
 * Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке, а элементы другого массива – на другой.
 *
 * Запятая между последним элементом одного массива и первым элементом следующего не нужна.
 *
 * Если во втором задании в консоль у вас вывелся результат
 * 1, 2, 3
 * 1.57, 7.654, 9.986
 * *произвольные элементы третьего массива*
 *
 * То в третьем задании результат должен быть
 * 3, 2, 1
 * 9.986, 7.654, 1.57
 * *произвольные элементы третьего массива в обратном порядке*
 */
public class Task3 extends Task0
{
    public static void main(String[] args)
    {
        int[] integerArray = getIntegerArray();
        int integerArrayLastKey = integerArray.length - 1;

        float[] floatArray = getFloatArray();
        int floatArrayLastKey = floatArray.length - 1;

        String[] stringArray = getStringArray();
        int stringArrayLastKey = stringArray.length - 1;

        /* *** Распечатка целочисленного массива в порядке от конца до начала *** */

        for (int counter = integerArrayLastKey; counter >= 0; counter--) {
            if (counter != integerArrayLastKey) {
                System.out.print(",");
            }

            System.out.print(integerArray[counter]);
        }

        System.out.println();

        /* *** Распечатка массива чисел с плавающей точкой в порядке от конца до начала *** */

        for (int counter = floatArrayLastKey; counter >= 0; counter--) {
            if (counter != floatArrayLastKey) {
                System.out.print(",");
            }

            System.out.print(floatArray[counter]);
        }

        System.out.println();

        /* *** Распечатка строкового массива в порядке от конца до начала *** */

        for (int counter = stringArrayLastKey; counter >= 0; counter--) {
            if (counter != stringArrayLastKey) {
                System.out.print(",");
            }

            System.out.print(stringArray[counter]);
        }

        System.out.println();
    }
}

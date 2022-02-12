package com.company.course02.homework01;

import java.util.Arrays;

/**
 * Напишите метод, который изменяет значение массива типа Integer.
 * Объявите метод changeValue, который принимает параметр массива типа Integer под названием value.
 * Внутри метода с помощью оператора присваивания запишите в первую ячейку параметра цифру 99.
 *
 * В методе main объявите массив типа Integer под названием value и запишите туда значение {3,4}.
 * В следующей строке вызовите метод changeValue и передайте в него этот массив.
 */
public class Task08 {
    public static void main(String[] args) {
        Integer[] value = new Integer[]{3, 4};
        System.out.println("value = " + Arrays.toString(value));

        changeValue(value);
        System.out.println("value = " + Arrays.toString(value));
    }

    private static void changeValue(Integer[] value) {
        value[0] = 99;
        System.out.println("value = " + Arrays.toString(value));
    }
}

package com.company.course01.homework06;

/**
 * Создайте матрицу 3х3 (двумерный массив типа int).
 * Заполните единицами обе диагонали матрицы и напечатайте ее в консоль.
 * Постарайтесь заполнить обе диагонали в одном цикле.
 */
public class Task05 {
    public static void main(String[] args) {
        int arrayLength = 3;
        int[][] array = new int[arrayLength][arrayLength];

        for (int counter = 0; counter < arrayLength; counter++) {
            array[counter][counter] = 1;
            array[counter][arrayLength - 1 - counter] = 1;
        }

        for (int[] row : array) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}

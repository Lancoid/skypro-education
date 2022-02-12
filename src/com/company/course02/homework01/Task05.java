package com.company.course02.homework01;

/**
 * Напишите метод, который изменяет значение переменной типа int.
 * Объявите метод changeValue, который принимает параметр типа int под названием value.
 * Внутри метода с помощью оператора присваивания запишите в параметр значение 22.
 *
 * В методе main объявите переменную типа int под названием value и запишите туда значение 33.
 * В следующей строке вызовите метод changeValue и передайте в него эту переменную.
 */
public class Task05 {
    public static void main(String[] args) {
        int value = 33;
        System.out.println("value = " + value);

        changeValue(value);
        System.out.println("value = " + value);
    }

    private static void changeValue(int value) {
        value = 22;
        System.out.println("param = " + value);
    }
}

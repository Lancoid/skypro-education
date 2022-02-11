package com.company.course02.homework01;

/**
 * Напишите метод, который изменяет значение переменной типа Integer.
 * Объявите метод changeValue, который принимает параметр типа Integer под названием value.
 * Внутри метода с помощью оператора присваивания запишите в параметр значение 22.
 *
 * В методе main объявите переменную типа Integer под названием value и запишите туда значение 33.
 * В следующей строке вызовите метод changeValue и передайте в него эту переменную.
 */
public class Task06 {
    public static void main(String[] args) {
        Integer value = 33;
        System.out.println("value = " + value);

        changeValue(value);
        System.out.println("value = " + value);
    }

    private static void changeValue(Integer value) {
        value = 22;
        System.out.println("value = " + value);
    }
}

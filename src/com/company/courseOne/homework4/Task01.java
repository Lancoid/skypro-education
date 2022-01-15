package com.company.courseOne.homework4;

/**
 * Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
 * На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
 * Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
 * Не забудьте выполнить переход на новую строку между двумя циклами.
 *
 * В результате программы вывод должен получиться следующий:
 * 1 2 3 4 5 6 7 8 9 10
 * 10 9 8 7 6 5 4 3 2 1
 */
public class Task01 {
    public static void main(String[] args) {
        int counter = 1;

        System.out.println("Использование цикла while для вывода от 1 до 10");

        while (counter <= 10) {
            System.out.print(counter + " ");
            counter++;
        }

        System.out.println("\nИспользование цикла for для вывода от 10 до 1");

        for (counter = 10; counter > 0; --counter) {
            System.out.print(counter + " ");
        }
    }
}

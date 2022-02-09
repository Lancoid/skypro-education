package com.company.course01.homework08;

/**
 * Вернемся к задаче о валидаторе текста из урока по строкам.
 *
 * Напишите метод, который в виде параметра принимает отсортированную строку.
 *
 * Например, aabccddefgghiijjkk.
 *
 * С помощью цикла проверьте, что в строке нет дублей, и выведите в консоль сообщение об этом.
 *
 * Если дубль найден,
 * нужно прервать поиск по остальным символам и вывести сообщение о присутствии дубля,
 * причем с указанием, какой именно символ задублирован.
 * Затем сразу же прервать выполнение метода.
 *
 * Сам метод ничего возвращать не должен (void).
 */
@SuppressWarnings("SpellCheckingInspection")
public class Task04 {
    public static void main(String[] args) {
        String string = "aabccddefgghiijjkk";

        System.out.println("Исходная строка - " + string);

        checkString(string);
    }

    private static void checkString(String string) {
        StringBuilder temporaryString = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);

            if (temporaryString.toString().contains(String.valueOf(symbol))) {
                System.out.println("В строке есть дублирование символа - " + symbol);
                break;
            }

            temporaryString.append(symbol);
        }
    }
}

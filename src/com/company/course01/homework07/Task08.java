package com.company.course01.homework07;

/**
 * Дана строка из букв английского алфавита "aabccddefgghiijjkk".
 * Нужно найти и напечатать буквы, которые дублируются в строке.
 *
 * Обратите внимание, что строка отсортирована, т. е. дубли идут друг за другом.
 * В итоге в консоль должен быть выведен результат программы: "acdgijk".
 */
public class Task08 {
    public static void main(String[] args) {
        String inputString = "aabccddefgghiijjkk";
        System.out.println("Исходная строка - " + inputString);

        String expectedString = "acdgijk";
        System.out.println("Ожидаемая строка - " + expectedString);

        char[] charArray = inputString.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            for (int j = i + 1; j < inputString.length(); j++) {
                if (charArray[i] == charArray[j]) {
                    stringBuilder.append(charArray[j]);
                    break;
                }
            }
        }

        System.out.println("Полученная строка - " + stringBuilder);
        System.out.println("Полученная строка " + (stringBuilder.toString().equals(expectedString) ? "" : "не ") + "верна ожидаемой строке");
    }
}

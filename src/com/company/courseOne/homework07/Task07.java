package com.company.courseOne.homework07;

/**
 * Имеется две строки.
 * Первая: "135"
 * Вторая: "246"
 *
 * Соберите из двух строк одну, содержащую данные "123456".
 * Использовать сортировку нельзя.
 * Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
 * Выведите результат в консоль в формате: “Данные строки — ….”
 *
 * 💡 Следует использовать StringBuilder.
 */
@SuppressWarnings({"ConstantConditions", "ManualMinMaxCalculation"})
public class Task07 {
    public static void main(String[] args) {
        String firstString = "135";
        String secondString = "246";

        char[] firstTemporaryArray = firstString.toCharArray();
        char[] secondTemporaryArray = secondString.toCharArray();

        int maxCounter = firstString.length() >= secondString.length() ? firstString.length() : secondString.length();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < maxCounter; i++) {
            if (i < firstTemporaryArray.length) {
                stringBuilder.append(firstTemporaryArray[i]);
            }

            if (i < secondTemporaryArray.length) {
                stringBuilder.append(secondTemporaryArray[i]);
            }
        }

        System.out.println("Первая исходная строка - " + firstString);
        System.out.println("Вторая исходная строка - " + secondString);
        System.out.println("Результат слияния строк - " + stringBuilder);
    }
}

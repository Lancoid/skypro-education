package com.company.courseOne.homework07;

/**
 * Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
 *
 * Такую оплошность нужно исправить, написав программу,
 * которая преобразует написанное со строчных букв Ф. И. О. в правильный формат.
 *
 * В качестве исходных данных используйте строку fullName c данными "ivanov ivan ivanovich",
 * которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
 * Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв — …”
 *
 * 💡 Метод toCharArray() может быть полезен.
 * 💡 Для преобразования символа в верхний регистр следует использовать метод Character.toUpperCase(c), где c — символ.
 */
public class Task06 {
    public static void main(String[] args) {
        String inputString = "ivanov ivan ivanovich";
        char[] temporaryArray = inputString.toCharArray();
        boolean switchToUpperCase = true;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < temporaryArray.length; i++) {
            if (switchToUpperCase) {
                temporaryArray[i] = Character.toUpperCase(temporaryArray[i]);
                switchToUpperCase = false;
            }

            if (temporaryArray[i] == ' ') {
                switchToUpperCase = true;
            }

            stringBuilder.append(temporaryArray[i]);
        }

        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + stringBuilder);

    }
}

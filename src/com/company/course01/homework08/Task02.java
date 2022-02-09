package com.company.course01.homework08;

/**
 * Вспомним задание 2 по условным операторам, где нам необходимо было предложить пользователю облегченную версию приложения.
 * @see com.company.course01.homework03.Task02
 *
 * Напишите метод, куда подаются два параметра: тип операционной системы (ОС) (0 — iOS или 1 — Android) и год выпуска устройства.
 *
 * Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).
 *
 * Текущий год можно получить таким способом: ```int currentYear = LocalDate.now().getYear();```
 *
 * Или самим задать значение вручную, введя в переменную числовое значение.
 *
 * В результате программа должна выводить в консоль в зависимости от исходных данных,
 * какую версию приложения (обычную или lite) и для какой ОС (Android или iOS) нужно установить пользователю.
 */
@SuppressWarnings("DuplicatedCode")
public class Task02 {
    private static final int IOS = 0;
    private static final int ANDROID = 1;

    public static void main(String[] args) {
        int clientOS = 1;
        int clientDeviceYear = 2005;

        checkPhone(clientOS, clientDeviceYear);
    }

    private static void checkPhone(int clientOS, int clientDeviceYear) {
        boolean isLiteVersionNeeded = clientDeviceYear < 2015;

        if (clientOS == IOS) {
            System.out.println("Установите " + (isLiteVersionNeeded ? "облегченную" : "") + " версию приложения для iOS по ссылке");
        } else if (clientOS == ANDROID) {
            System.out.println("Установите " + (isLiteVersionNeeded ? "облегченную" : "") + " версию приложения для Android по ссылке");
        }
    }
}

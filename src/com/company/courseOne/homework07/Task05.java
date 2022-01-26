package com.company.courseOne.homework07;

/**
 * К нам снова обратились за помощью,
 * но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
 *
 * В качестве исходных данных используйте:
 * Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
 *
 * строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
 * переменная firstName — для хранения имени;
 * переменная middleName — для хранения отчества;
 * переменная lastName — для хранения фамилии.
 *
 * Решите задание с помощью метода substring().
 *
 * Результат программы выведите в формате:
 * “Имя сотрудника — …”
 * “Фамилия сотрудника — …”
 * “Отчество сотрудника — ...”
 *
 * 💡 Важно: «в голове» высчитывать позиции пробелов и параметров для обрезания строки запрещено. Их должен вычислить компьютер.
 * 💡 Подсказка: Определить индексы символов помогут методы indexOf() и lastIndexOf().
 */
public class Task05 {
    public static void main(String[] args) {
        String fullName = "Ivanov Ivan Ivanovich";

        System.out.println("ФИО сотрудника — " + fullName + ".");

        int firstDelimiter = fullName.indexOf(" ");
        int secondDelimiter = fullName.indexOf(" ", firstDelimiter + 1);

        String lastName = fullName.substring(0, firstDelimiter);
        String firstName = fullName.substring(firstDelimiter, secondDelimiter);
        String middleName = fullName.substring(secondDelimiter);

        System.out.println("Фамилия сотрудника — " + lastName + ".");
        System.out.println("Имя сотрудника — " + firstName + ".");
        System.out.println("Отчество сотрудника — " + middleName + ".");
    }
}

package com.company.course02.homework02;

import com.company.course02.homework02.faculty.FacultyNames;
import com.company.course02.homework02.student.GryffindorStudent;
import com.company.course02.homework02.student.HufflepuffStudent;
import com.company.course02.homework02.student.RavenclawStudent;
import com.company.course02.homework02.student.SlytherinStudent;
import com.company.course02.utilities.NumberGenerator;

/**
 * В школе магии и волшебства Хогвартс есть четыре факультета:
 *
 * - Гриффиндор
 * - Пуффендуй
 * - Когтевран
 * - Слизерин
 *
 * Студентам каждого из этих факультетов присущи свои свойства характера.
 * Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100.
 *
 * Всем Гриффиндорцам присущи благородство, честь и храбрость.
 * Студенты Пуффендуя трудолюбивы, верны, честны.
 * Когтевранцы умны, мудры, остроумны и полны творчества.
 * Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
 *
 * Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью в сколько-то баллов и могут трансгрессировать на какое-то расстояние.
 * Сила магии и расстояние трансгресии у каждого ученика своё и выражается в целочисленном эквиваленте.
 *
 * Гарри Поттер, Гермиона Грейнджер и Рон Уизли учатся на факультете Гриффиндор.
 * Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине.
 * На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
 * На факультете Когтевран учится Чжоу Чанг, Падма Патил и Маркус Белби.
 *
 * Напишите программу, в которой реализован класс hogwarts и четыре класса по названиям факультетов.
 * В классах факультетов опишите свойства каждого, перечисленные выше.
 * Ученики должны быть реализованы в качестве объектов.
 * Должна быть возможность задавать качества учеников через конструктор.
 * Присвойте каждому свойству произвольное числовое значение от 0 до 100.
 *
 * Сделайте метод, который выводит на экран описание студента.
 * В описание надо включать качества, которые присущи всем студентам,
 * плюс качества, которые присущи студенту, потому что он учится на конкретном факультете.
 *
 * Реализуйте 4 метода, по одному для каждого факультета,
 * которые сравнивают между собой учеников одного факультета по свойствам и в консоль выводят сравнительную оценку между двумя учениками.
 *
 * Например, Гермиона умнее, чем Рон.
 *
 * Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии,
 * и выводит в консоль сравнительную оценку между двумя учениками.
 *
 * Например, Драко Малфой обладает бОльшей мощностью магии, чем Захария Смит.
 *
 * Важно: поля объектов должны быть приватными.
 */
public class Task01 {
    public static void main(String[] args) {
        Hogwarts hogwarts = new Hogwarts(50);
        NumberGenerator numberGenerator = new NumberGenerator();

        hogwarts.addStudent(new GryffindorStudent("Гарри", "Поттер", numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom()));
        hogwarts.addStudent(new GryffindorStudent("Гермиона", "Грейнджер", numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom()));
        hogwarts.addStudent(new GryffindorStudent("Рон", "Уизли", numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom()));

        hogwarts.addStudent(new HufflepuffStudent("Захария", "Смит", numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom()));
        hogwarts.addStudent(new HufflepuffStudent("Седрик", "Диггори", numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom()));
        hogwarts.addStudent(new HufflepuffStudent("Джастин", "Финч-Флетчли", numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom()));

        hogwarts.addStudent(new RavenclawStudent("Чжоу", "Чанг", numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom()));
        hogwarts.addStudent(new RavenclawStudent("Падма", "Патил", numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom()));
        hogwarts.addStudent(new RavenclawStudent("Маркус", "Белби", numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom()));

        hogwarts.addStudent(new SlytherinStudent("Драко", "Малфой", numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom()));
        hogwarts.addStudent(new SlytherinStudent("Грэхэм", "Монтегю", numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom()));
        hogwarts.addStudent(new SlytherinStudent("Грегори", "Гойл", numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom(), numberGenerator.getRandom()));

        System.out.println("-----------------------------------------------------------------------------------------------------------------------");

        hogwarts.showStudentInformation("Гарри", "Поттер");

        System.out.println("-----------------------------------------------------------------------------------------------------------------------");

        hogwarts.compareTwoStudents(FacultyNames.GRYFFINDOR);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------");

        hogwarts.compareTwoStudents("Захария", "Смит", "Маркус", "Белби");
    }
}

package com.company.course02.homework02;

import com.company.course02.homework02.faculty.FacultyGryffindor;
import com.company.course02.homework02.faculty.FacultyHufflepuff;
import com.company.course02.homework02.faculty.FacultyRavenclaw;
import com.company.course02.homework02.faculty.FacultySlytherin;

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

        FacultyGryffindor facultyGryffindor = new FacultyGryffindor();
        FacultyHufflepuff facultyHufflepuff = new FacultyHufflepuff();
        FacultyRavenclaw facultyRavenclaw = new FacultyRavenclaw();
        FacultySlytherin facultySlytherin = new FacultySlytherin();

        hogwarts.addStudent(new Student("Гарри", "Поттер", facultyGryffindor, 54, 354));
        hogwarts.addStudent(new Student("Гермиона", "Грейнджер", facultyGryffindor, 78, 1234));
        hogwarts.addStudent(new Student("Рон", "Уизли", facultyGryffindor, 23, 163));

        hogwarts.addStudent(new Student("Захария", "Смит", facultyHufflepuff, 42, 56));
        hogwarts.addStudent(new Student("Седрик", "Диггори", facultyHufflepuff, 61, 89));
        hogwarts.addStudent(new Student("Джастин", "Финч-Флетчли", facultyHufflepuff, 38, 32));

        hogwarts.addStudent(new Student("Чжоу", "Чанг", facultyRavenclaw, 39, 49));
        hogwarts.addStudent(new Student("Падма", "Патил", facultyRavenclaw, 27, 25));
        hogwarts.addStudent(new Student("Маркус", "Белби", facultyRavenclaw, 12, 11));

        hogwarts.addStudent(new Student("Драко", "Малфой", facultySlytherin, 40, 42));
        hogwarts.addStudent(new Student("Грэхэм", "Монтегю", facultySlytherin, 21, 18));
        hogwarts.addStudent(new Student("Грегори", "Гойл", facultySlytherin, 9, 0));

        System.out.println("-----------------------------------------------------------------------------------------------------------------------");

        hogwarts.showStudentInformation("Гарри", "Поттер");

        System.out.println("-----------------------------------------------------------------------------------------------------------------------");

        hogwarts.compareTwoStudents(facultyGryffindor);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------");

        hogwarts.compareTwoStudents("Захария", "Смит", "Маркус", "Белби");
    }
}

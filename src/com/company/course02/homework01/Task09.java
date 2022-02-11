package com.company.course02.homework01;

/**
 * Объявите объект класса person с полями name и surname.
 * Переопределите у него метод toString так, чтобы он возвращал строку из name и surname.
 * Объявите метод changePerson, который принимает параметр типа Person под названием person.
 * Внутри метода с помощью оператора присваивания запишите в параметр новый объект типа Person.
 * Присвойте строке name значение Ilya, строке surname — значение Lagutenko.
 *
 * В методе main объявите переменную типа Person под названием person и запишите новый объект типа Person.
 * Присвойте строке name значение Lyapis, строке surname значение — Trubetskoy.
 *
 * В следующей строке вызовите метод changePerson и передайте в него эту переменную.
 */
public class Task09 {
    public static void main(String[] args) {
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println("person = " + person);

        changePerson(person);
        System.out.println("person = " + person);
    }

    private static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
        System.out.println("person = " + person);
    }
}



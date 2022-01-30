package com.company.courseOne.homework09;

/**
 * Создать класс Library, который будет иметь своим полем массив из прошлого уровня.
 * Учесть, что доступ к нему должен быть только из Library (private поле), а сеттеры и геттеры отсутствуют.
 * Работать с массивом можно только через внутренние нестатические методы класса Library.
 *
 * Конструктор класса должен получать в качестве параметра размер массива
 * и инициализировать в себе поле массива тем размером, что пришел параметром.
 * Перенести методы из прошлого уровня в класс Library, сделать их нестатическими.
 *
 * Создать новые нестатические методы в классе Library:
 * 1 Напечатать информацию о книге по ее названию, которое приходит в метод в качестве параметра.
 *   Формат: “The Stand by Stephen King was published in 1978”
 * 2 Изменить год публикации книги по ее названию.
 *   В метод подаются два параметра, а именно: название и новый год публикации. Нужно найти книгу и изменить ее год публикации.
 */
public class Task03 {
    public static void main(String[] args) {
        Library library = new Library(10);

        Author authorStephenKing = new Author("Stephen", "Edwin", "King");
        Book newBook = new Book("The Stand", authorStephenKing, 1978);

        library.addBooks(newBook);

        library.printBook("The Stand");

        library.changePublicationYear("The Stand", 1980);

        library.printBook("The Stand");
    }
}

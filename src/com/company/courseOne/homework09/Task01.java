package com.company.courseOne.homework09;

import java.util.Random;

/**
 * 1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации.
 * Типы полей должны быть String, Author (который мы создадим в п. 2) и int.
 *
 * 2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
 *
 * 3. Написать конструкторы для обоих классов, заполняющие все поля.
 *
 * 4. Создать геттеры для всех полей автора и всех полей книги.
 *
 * 5. Создать сеттер для поля «Год публикации» у книги.
 *
 * 6. В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов Автор (достаточно тоже двух) и инициализировать друг друга.
 * Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.
 * Метод main не должен находиться в классах Book и Author.
 * Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.
 *
 * 7. В том же методе main изменить год публикации одной из книг с помощью сеттера.
 */
public class Task01 {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Иван", "Иванович", "Иванов");
        Author secondAuthor = new Author("Пётр", "Петрович", "Петров");
        Author thirdAuthor = new Author("Сидор", "Сидорович", "Сидоров");

        Book[] books = new Book[12];
        Author author;
        int periodForAuthor = books.length / 3;
        int year;
        int counter;

        for (counter = 0, year = 2000; counter < books.length; counter++, year++) {
            if (counter < periodForAuthor) {
                author = firstAuthor;
            } else if (counter < periodForAuthor * 2) {
                author = secondAuthor;
            } else {
                author = thirdAuthor;
            }

            books[counter] = new Book("Какая-то странная книга от " + author.getLastName() + "а", author, year);
        }

        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("------------- Изменение года публикации -------------");

        Random rand = new Random();
        for (Book value : books) {
            value.setYear(value.getYear() + rand.nextInt(10));
        }

        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}

package com.company.course01.homework10;

/**
 * Реализовать методы toString, equals и hashCode в классах Author и Book, которые были созданы на прошлом уроке.
 *
 * @see com.company.course01.homework09.Task01
 * Обратите внимание, что toString книги не должен дублировать код из toString автора, а должен делегировать (вызывать) его версию метода.
 */
@SuppressWarnings("DuplicatedCode")
public class Task01 {
    public static void main(String[] args) {
        Author firstAuthor = new Author("И.", "И.", "Иванов");
        Author secondAuthor = new Author("П.", "П.", "Петров");

        Book firstBook = new Book("Какая-то странная книга от " + firstAuthor.getLastName() + "а", firstAuthor, 2012);
        Book secondBook = new Book("Какая-то странная книга от " + secondAuthor.getLastName() + "а", secondAuthor, 2013);

        getObjectHash(firstAuthor);
        getObjectHash(secondAuthor);
        getObjectHash(firstBook);
        getObjectHash(secondBook);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------");

        checkObjectsEquals(firstAuthor, secondAuthor);
        checkObjectsEquals(firstAuthor, firstAuthor);
        checkObjectsEquals(firstAuthor, firstBook);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------");

        checkObjectsEquals(firstBook, secondBook);
        checkObjectsEquals(firstBook, firstBook);
        checkObjectsEquals(firstBook, firstAuthor);
    }

    private static void checkObjectsEquals(Object a, Object b) {
        String isEquals = a.equals(b) ? " эквивалентен " : " не эквивалентен ";
        System.out.println("Объект " + a + isEquals + " объекту " + b);
    }

    private static void getObjectHash(Object object) {
        System.out.println("Хэш объекта " + object + " равен " + object.hashCode());
    }
}

package com.company.courseOne.homework09;

/**
 * Необходимо в классе с методом main создать массив объектов типа Book и положить туда созданные книги.
 *
 * Написать статические методы для работы с массивом в классе, где располагается метод main:
 * 💡 Добавить книгу (найти свободную ячейку массива и положить туда книгу).
 *    Учесть, что этот метод может быть вызван любое количество раз (от 1 до 5) и каждая новая книга должна успешно укладываться в массив.
 * 💡 Напечатать в консоль все книги из массива в следующем формате: “Stephen King: The Stand: 1978”
 */
public class Task02 {
    private static Book[] books;

    public static void main(String[] args) {
        books = new Book[10];

        Author authorStephenKing = new Author("Stephen", "Edwin", "King");
        Book newBook = new Book("The Stand", authorStephenKing, 1978);

        addBooks(newBook);
        printBooks();
    }

    private static void addBooks(Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return;
            }
        }

        throw new RuntimeException("В массиве книг нет свободного места");
    }

    private static void printBooks() {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.getShortInfo());
            }
        }
    }
}

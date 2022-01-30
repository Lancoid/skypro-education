package com.company.courseOne.homework09;

public class Library {
    Book[] books;

    public Library(int length) {
        books = new Book[length];
    }

    public void addBooks(Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return;
            }
        }

        throw new RuntimeException("В массиве книг нет свободного места");
    }

    public void printBook(String name) {
        for (Book book : books) {
            if (book != null && book.getName().equals(name)) {
                System.out.println(book.getShortInfo());

                return;
            }
        }

        System.out.println("Не найдена книга по названию '" + name + "'");
    }

    public void changePublicationYear(String name, int year) {
        for (Book book : books) {
            if (book != null && book.getName().equals(name)) {
                book.setYear(year);

                return;
            }
        }

        System.out.println("Не найдена книга по названию '" + name + "'");
    }
}

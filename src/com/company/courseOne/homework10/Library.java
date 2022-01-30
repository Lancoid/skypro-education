package com.company.courseOne.homework10;

public class Library {
    Book[] books;

    public Library(int length) {
        this.books = new Book[length];
    }

    public void addBook(Book newBook){
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return;
            }
        }

        throw new RuntimeException("No place in the library");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Library:");
        int counter = 0;

        for (Book book: books) {
            if (book != null) {
                stringBuilder.append("\n");
                stringBuilder.append(book);
                ++counter;
            }
        }

        if (counter == 0) {
            stringBuilder.append("\nBooks not found");
        }

        return stringBuilder.toString();
    }
}

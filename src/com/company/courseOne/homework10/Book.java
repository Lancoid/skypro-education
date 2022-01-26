package com.company.courseOne.homework10;

import java.util.Objects;

@SuppressWarnings("unused")
public class Book {
    private final String name;
    private final Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book {name = " + name + ", author = " + author.toString() + ", year = " + year + "}";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Book book)) {
            return false;
        }

        if (this.hashCode() != object.hashCode()) {
            return false;
        }

        return year == book.year && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year) + author.hashCode();
    }
}

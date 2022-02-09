package com.company.course01.homework09;

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
        String authorFio = author.getFirstName().charAt(0) + "." + author.getMiddleName().charAt(0) + "." + author.getLastName();

        return "Book: name = '" + name + "', Author = " + authorFio + "', year = " + year;
    }

    public String getShortInfo() {
        return author.getFirstName() + " " + author.getLastName() + ": " + name + ": " + year;
    }
}

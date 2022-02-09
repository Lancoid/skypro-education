package com.company.course01.homework09;

@SuppressWarnings("ClassCanBeRecord")
public class Author {
    private final String firstName;
    private final String middleName;
    private final String lastName;

    public Author(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }
}

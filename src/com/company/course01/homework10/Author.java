package com.company.course01.homework10;

import java.util.Objects;

@SuppressWarnings({"ClassCanBeRecord", "unused"})
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

    @Override
    public String toString() {
        return "Author {firstName = " + firstName + ", middleName = " + middleName + ", lastName = " + lastName + "}";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Author author)) {
            return false;
        }

        if (this.hashCode() != object.hashCode()) {
            return false;
        }

        return Objects.equals(firstName, author.firstName) && Objects.equals(middleName, author.middleName) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName);
    }
}

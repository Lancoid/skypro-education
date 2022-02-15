package com.company.course02.homework02.student;

import com.company.course02.homework02.faculty.FacultyInterface;

public interface StudentInterface {
    String getName();

    String getSurname();

    String getFio();

    FacultyInterface getFaculty();

    String getFacultyName();

    int getPowerOfSorcery();

    int getTransgressionDistance();

    void compare(StudentInterface student);

    void compareByFaculty(StudentInterface student);
}

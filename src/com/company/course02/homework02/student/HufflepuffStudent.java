package com.company.course02.homework02.student;

import com.company.course02.homework02.faculty.FacultyHufflepuff;
import com.company.course02.homework02.faculty.FacultyProperties;

public class HufflepuffStudent extends AbstractStudent {
    public HufflepuffStudent(
            String name,
            String surname,
            int powerOfSorcery,
            int transgressionDistance,
            int industriousness,
            int loyalty,
            int honesty
    ) {
        this.name = name;
        this.surname = surname;

        this.faculty = new FacultyHufflepuff(industriousness, loyalty, honesty);

        this.powerOfSorcery = powerOfSorcery;
        this.transgressionDistance = transgressionDistance;

    }

    public void compareByFaculty(StudentInterface student) {
        if (!this.getFacultyName().equals(student.getFacultyName())) {
            return;
        }

        printCompletionResult(getFio(), student.getFio(), getFaculty().getIndustriousness(), student.getFaculty().getIndustriousness(), FacultyProperties.INDUSTRIOUSNESS.getName());
        printCompletionResult(getFio(), student.getFio(), getFaculty().getLoyalty(), student.getFaculty().getLoyalty(), FacultyProperties.LOYALTY.getName());
        printCompletionResult(getFio(), student.getFio(), getFaculty().getHonesty(), student.getFaculty().getHonesty(), FacultyProperties.HONESTY.getName());
    }
}

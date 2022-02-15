package com.company.course02.homework02.student;

import com.company.course02.homework02.faculty.FacultyGryffindor;
import com.company.course02.homework02.faculty.FacultyProperties;

public class GryffindorStudent extends AbstractStudent {
    public GryffindorStudent(
            String name,
            String surname,
            int powerOfSorcery,
            int transgressionDistance,
            int nobility,
            int honor,
            int bravery
    ) {
        this.name = name;
        this.surname = surname;

        this.faculty = new FacultyGryffindor(nobility, honor, bravery);

        this.powerOfSorcery = powerOfSorcery;
        this.transgressionDistance = transgressionDistance;
    }

    public void compareByFaculty(StudentInterface student) {
        if (!this.getFacultyName().equals(student.getFacultyName())) {
            return;
        }

        printCompletionResult(getFio(), student.getFio(), getFaculty().getNobility(), student.getFaculty().getNobility(), FacultyProperties.NOBILITY.getName());
        printCompletionResult(getFio(), student.getFio(), getFaculty().getHonor(), student.getFaculty().getHonor(), FacultyProperties.HONOR.getName());
        printCompletionResult(getFio(), student.getFio(), getFaculty().getBravery(), student.getFaculty().getBravery(), FacultyProperties.BRAVERY.getName());
    }
}

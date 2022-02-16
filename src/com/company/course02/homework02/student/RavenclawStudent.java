package com.company.course02.homework02.student;

import com.company.course02.homework02.faculty.FacultyProperties;
import com.company.course02.homework02.faculty.FacultyRavenclaw;

public class RavenclawStudent extends AbstractStudent {
    public RavenclawStudent(
            String name,
            String surname,
            int powerOfSorcery,
            int transgressionDistance,
            int mind,
            int wisdom,
            int wit,
            int creation
    ) {
        this.name = name;
        this.surname = surname;

        this.faculty = new FacultyRavenclaw(mind, wisdom, wit, creation);

        this.powerOfSorcery = powerOfSorcery;
        this.transgressionDistance = transgressionDistance;
    }

    public void compareByFaculty(StudentInterface student) {
        if (!this.getFacultyName().equals(student.getFacultyName())) {
            return;
        }

        printCompletionResult(getFio(), student.getFio(), getFaculty().getMind(), student.getFaculty().getMind(), FacultyProperties.MIND.getName());
        printCompletionResult(getFio(), student.getFio(), getFaculty().getWisdom(), student.getFaculty().getWisdom(), FacultyProperties.WISDOM.getName());
        printCompletionResult(getFio(), student.getFio(), getFaculty().getWit(), student.getFaculty().getWit(), FacultyProperties.WIT.getName());
        printCompletionResult(getFio(), student.getFio(), getFaculty().getCreation(), student.getFaculty().getCreation(), FacultyProperties.CREATION.getName());
    }
}

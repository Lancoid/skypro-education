package com.company.course02.homework02.student;

import com.company.course02.homework02.faculty.FacultyProperties;
import com.company.course02.homework02.faculty.FacultySlytherin;

public class SlytherinStudent extends AbstractStudent {
    public SlytherinStudent(
            String name,
            String surname,
            int powerOfSorcery,
            int transgressionDistance,
            int cunning,
            int determination,
            int ambition,
            int inventiveness,
            int lustForPower

    ) {
        this.name = name;
        this.surname = surname;

        this.faculty = new FacultySlytherin(cunning, determination, ambition, inventiveness, lustForPower);

        this.powerOfSorcery = powerOfSorcery;
        this.transgressionDistance = transgressionDistance;
    }

    public void compareByFaculty(StudentInterface student) {
        if (!this.getFacultyName().equals(student.getFacultyName())) {
            return;
        }

        printCompletionResult(getFio(), student.getFio(), getFaculty().getCunning(), student.getFaculty().getCunning(), FacultyProperties.CUNNING.getName());
        printCompletionResult(getFio(), student.getFio(), getFaculty().getDetermination(), student.getFaculty().getDetermination(), FacultyProperties.DETERMINATION.getName());
        printCompletionResult(getFio(), student.getFio(), getFaculty().getAmbition(), student.getFaculty().getAmbition(), FacultyProperties.AMBITION.getName());
        printCompletionResult(getFio(), student.getFio(), getFaculty().getInventiveness(), student.getFaculty().getInventiveness(), FacultyProperties.INVENTIVENESS.getName());
        printCompletionResult(getFio(), student.getFio(), getFaculty().getLustForPower(), student.getFaculty().getLustForPower(), FacultyProperties.LUST_FOR_POWER.getName());
    }
}

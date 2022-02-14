package com.company.course02.homework02.faculty;

public class FacultyRavenclaw extends AbstractFaculty {
    public FacultyRavenclaw() {
        this.name = "Когтевран";

        this.properties = new FacultyProperties[]{
                FacultyProperties.MIND,
                FacultyProperties.WISDOM,
                FacultyProperties.WIT,
                FacultyProperties.CREATION
        };
    }
}

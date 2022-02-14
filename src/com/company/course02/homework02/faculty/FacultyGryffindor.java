package com.company.course02.homework02.faculty;

public class FacultyGryffindor extends AbstractFaculty {
    public FacultyGryffindor() {
        this.name = "Гриффиндор";

        this.properties = new FacultyProperties[]{
                FacultyProperties.NOBILITY,
                FacultyProperties.HONOR,
                FacultyProperties.BRAVERY
        };
    }
}

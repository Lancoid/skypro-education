package com.company.course02.homework02.faculty;

public class FacultySlytherin extends AbstractFaculty {
    public FacultySlytherin() {
        this.name = "Слизерин";

        this.properties = new FacultyProperties[]{
                FacultyProperties.CUNNING,
                FacultyProperties.DETERMINATION,
                FacultyProperties.AMBITION,
                FacultyProperties.INVENTIVENESS,
                FacultyProperties.LUST_FOR_POWER
        };
    }
}

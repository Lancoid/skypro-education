package com.company.course02.homework02.faculty;

public class FacultyGryffindor extends AbstractFaculty {
    public FacultyGryffindor(
            int nobility,
            int honor,
            int bravery
    ) {
        this.name = FacultyNames.GRYFFINDOR;

        this.properties = new FacultyProperties[]{
                FacultyProperties.NOBILITY,
                FacultyProperties.HONOR,
                FacultyProperties.BRAVERY
        };

        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
}

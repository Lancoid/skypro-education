package com.company.course02.homework02.faculty;

public class FacultyRavenclaw extends AbstractFaculty {
    public FacultyRavenclaw(
            int mind,
            int wisdom,
            int wit,
            int creation
    ) {
        this.name = FacultyNames.RAVENCLAW;

        this.properties = new FacultyProperties[]{
                FacultyProperties.MIND,
                FacultyProperties.WISDOM,
                FacultyProperties.WIT,
                FacultyProperties.CREATION
        };

        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }
}

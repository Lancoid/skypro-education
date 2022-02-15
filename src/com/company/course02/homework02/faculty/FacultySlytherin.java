package com.company.course02.homework02.faculty;

public class FacultySlytherin extends AbstractFaculty {
    public FacultySlytherin(
            int cunning,
            int determination,
            int ambition,
            int inventiveness,
            int lustForPower
    ) {
        this.name = FacultyNames.SLYTHERIN;

        this.properties = new FacultyProperties[]{
                FacultyProperties.CUNNING,
                FacultyProperties.DETERMINATION,
                FacultyProperties.AMBITION,
                FacultyProperties.INVENTIVENESS,
                FacultyProperties.LUST_FOR_POWER
        };

        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.inventiveness = inventiveness;
        this.lustForPower = lustForPower;
    }
}

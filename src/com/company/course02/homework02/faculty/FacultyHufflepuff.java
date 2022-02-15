package com.company.course02.homework02.faculty;

public class FacultyHufflepuff extends AbstractFaculty {
    public FacultyHufflepuff(
            int industriousness,
            int loyalty,
            int honesty
    ) {
        this.name = FacultyNames.HUFFLEPUFF;

        this.properties = new FacultyProperties[]{
                FacultyProperties.INDUSTRIOUSNESS,
                FacultyProperties.LOYALTY,
                FacultyProperties.HONESTY
        };

        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
}

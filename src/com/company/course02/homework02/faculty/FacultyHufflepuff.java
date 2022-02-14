package com.company.course02.homework02.faculty;

public class FacultyHufflepuff extends AbstractFaculty {
    public FacultyHufflepuff() {
        this.name = "Пуффендуй";

        this.properties = new FacultyProperties[]{
                FacultyProperties.INDUSTRIOUSNESS,
                FacultyProperties.LOYALTY,
                FacultyProperties.HONESTY
        };
    }
}

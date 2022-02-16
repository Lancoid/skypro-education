package com.company.course02.homework02.faculty;

public enum FacultyNames {
    GRYFFINDOR("Гриффиндор"),
    HUFFLEPUFF("Пуффендуй"),
    RAVENCLAW("Когтевран"),
    SLYTHERIN("Слизерин");

    private final String name;

    FacultyNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

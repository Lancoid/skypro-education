package com.company.course02.homework02;

import com.company.course02.homework02.faculty.FacultyInterface;

@SuppressWarnings("ClassCanBeRecord")
public class Student {
    private final String name;
    private final String surname;
    private final FacultyInterface faculty;
    private final int powerOfSorcery;
    private final int transgressionDistance;

    public Student(String name, String surname, FacultyInterface faculty, int powerOfSorcery, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.powerOfSorcery = powerOfSorcery;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFio() {
        if (name.isEmpty() || surname.isEmpty()) {
            throw new RuntimeException("Ошибка заполнения данных студента, обратитесь к магическому администратору школы");
        }

        return name + " " + surname;
    }

    public FacultyInterface getFaculty() {
        return faculty;
    }

    public String getFacultyName() {
        return faculty.getName();
    }

    public int getPowerOfSorcery() {
        return powerOfSorcery;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    @Override
    public String toString() {
        return "Студент {" +
                "имя='" + name + '\'' +
                ", фамилия='" + surname + '\'' +
                ", факультет='" + faculty + '\'' +
                ", магическая мощность=" + powerOfSorcery +
                ", расстояние трансгрессии=" + transgressionDistance;
    }
}

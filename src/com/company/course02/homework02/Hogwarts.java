package com.company.course02.homework02;

import com.company.course02.homework02.faculty.FacultyInterface;

import java.util.ArrayList;
import java.util.Random;

public class Hogwarts {
    private final Student[] students;

    public Hogwarts(int studentsCount) {
        this.students = new Student[studentsCount];
    }

    public void addStudent(Student student) {
        if (student.getTransgressionDistance() < 0) {
            throw new RuntimeException("Расстояние трансгрессии должно быть не меньше ноля.");
        }
        if (student.getPowerOfSorcery() < 0) {
            throw new RuntimeException("Мощность магии должна быть не меньше ноля.");
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;

                System.out.println("Студент '" + students[i].getFio() + "' принят на факультет " + students[i].getFacultyName());

                return;
            }
        }

        throw new RuntimeException("В Хогвартсе нет свободных мест");
    }

    public void showStudentInformation(String name, String surname) {
        for (Student student : students) {
            if (student != null && student.getName().equals(name) && student.getSurname().equals(surname)) {
                System.out.println(student);

                return;
            }
        }

        throw new RuntimeException("В Хогвартсе не учится студент '" + name + " " + surname + "'");
    }

    public void compareTwoStudents(FacultyInterface facultyInterface) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getFaculty().equals(facultyInterface)) {
                list.add(i);
            }
        }

        if (list.size() < 2) {
            throw new RuntimeException("В Хогвартсе не нашлось двух учеников на факультете '" + facultyInterface.getName() + "'");
        }

        Random random = new Random();

        Integer firstKey = list.get(random.nextInt(list.size()));
        Integer secondKey = null;

        while (secondKey == null || firstKey.equals(secondKey)) {
            secondKey = list.get(random.nextInt(list.size()));
        }

        compareTwoStudents(students[firstKey], students[secondKey]);
    }

    public void compareTwoStudents(String firstName, String firstSurname, String secondName, String secondSurname) {
        Student firstStudent = null;
        Student secondStudent = null;

        for (Student student : students) {
            if (student != null) {
                if (student.getName().equals(firstName) && student.getSurname().equals(firstSurname)) {
                    firstStudent = student;
                }
                if (student.getName().equals(secondName) && student.getSurname().equals(secondSurname)) {
                    secondStudent = student;
                }
            }
        }

        if (firstStudent == null && secondStudent == null) {
            throw new RuntimeException("В Хогвартсе не учатся запрошенные ученики");
        } else if (firstStudent == null) {
            throw new RuntimeException("В Хогвартсе не учится первый запрошенный ученик");
        } else if (secondName == null) {
            throw new RuntimeException("В Хогвартсе не учится второй запрошенный ученик");
        }

        compareTwoStudents(firstStudent, secondStudent);
    }

    private void compareTwoStudents(Student firstStudent, Student secondStudent) {
        if (firstStudent.getPowerOfSorcery() > secondStudent.getPowerOfSorcery()) {
            System.out.println(firstStudent.getFio() + " больше по мощности магии, чем " + secondStudent.getFio());
        } else if (firstStudent.getPowerOfSorcery() < secondStudent.getPowerOfSorcery()) {
            System.out.println(firstStudent.getFio() + " меньше по мощности магии, чем " + secondStudent.getFio());
        } else {
            System.out.println(firstStudent.getFio() + " равен по мощности магии " + secondStudent.getFio());
        }

        if (firstStudent.getTransgressionDistance() > secondStudent.getTransgressionDistance()) {
            System.out.println(firstStudent.getFio() + " трансгрессирует дальше, чем " + secondStudent.getFio());
        } else if (firstStudent.getTransgressionDistance() < secondStudent.getTransgressionDistance()) {
            System.out.println(firstStudent.getFio() + " трансгрессирует ближе, чем " + secondStudent.getFio());
        } else {
            System.out.println(firstStudent.getFio() + " и " + secondStudent.getFio() + " трансгрессируют на одинаковое расстояние");
        }
    }
}

package com.company.course02.homework02;

import com.company.course02.homework02.faculty.FacultyNames;
import com.company.course02.homework02.student.StudentInterface;

import java.util.ArrayList;
import java.util.Random;

public class Hogwarts {
    private final StudentInterface[] students;

    public Hogwarts(int studentsCount) {
        this.students = new StudentInterface[studentsCount];
    }

    public void addStudent(StudentInterface student) {
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
        for (StudentInterface student : students) {
            if (student != null && student.getName().equals(name) && student.getSurname().equals(surname)) {
                System.out.println(student);

                return;
            }
        }

        throw new RuntimeException("В Хогвартсе не учится студент '" + name + " " + surname + "'");
    }

    public void compareTwoStudents(FacultyNames facultyName) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getFacultyName().equals(facultyName.getName())) {
                list.add(i);
            }
        }

        if (list.size() < 2) {
            throw new RuntimeException("В Хогвартсе не нашлось двух учеников на факультете '" + facultyName + "'");
        }

        Random random = new Random();

        Integer firstKey = list.get(random.nextInt(list.size()));
        Integer secondKey = null;

        while (secondKey == null || firstKey.equals(secondKey)) {
            secondKey = list.get(random.nextInt(list.size()));
        }

        students[firstKey].compare(students[secondKey]);
    }

    public void compareTwoStudents(String firstName, String firstSurname, String secondName, String secondSurname) {
        StudentInterface firstStudent = null;
        StudentInterface secondStudent = null;

        for (StudentInterface student : students) {
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
        } else if (secondStudent == null) {
            throw new RuntimeException("В Хогвартсе не учится второй запрошенный ученик");
        }

        firstStudent.compare(secondStudent);
    }
}

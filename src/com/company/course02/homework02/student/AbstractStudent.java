package com.company.course02.homework02.student;

import com.company.course02.homework02.faculty.FacultyInterface;

abstract class AbstractStudent implements StudentInterface {
    protected String name;
    protected String surname;
    protected FacultyInterface faculty;

    protected int powerOfSorcery;
    protected int transgressionDistance;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getFio() {
        if (name.isEmpty() || surname.isEmpty()) {
            throw new RuntimeException("Ошибка заполнения данных студента, обратитесь к магическому администратору школы");
        }

        return name + " " + surname;
    }

    @Override
    public FacultyInterface getFaculty() {
        return faculty;
    }

    @Override
    public String getFacultyName() {
        return faculty.getName();
    }

    @Override
    public int getPowerOfSorcery() {
        return powerOfSorcery;
    }

    @Override
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
                ", расстояние трансгрессии=" + transgressionDistance +
                " }";
    }

    public void compare(StudentInterface student) {
        if (getPowerOfSorcery() > student.getPowerOfSorcery()) {
            System.out.println(getFio() + " больше по мощности магии, чем " + student.getFio());
        } else if (getPowerOfSorcery() < student.getPowerOfSorcery()) {
            System.out.println(getFio() + " меньше по мощности магии, чем " + student.getFio());
        } else {
            System.out.println(getFio() + " равен по мощности магии " + student.getFio());
        }

        if (getTransgressionDistance() > student.getTransgressionDistance()) {
            System.out.println(getFio() + " трансгрессирует дальше, чем " + student.getFio());
        } else if (getTransgressionDistance() < student.getTransgressionDistance()) {
            System.out.println(getFio() + " трансгрессирует ближе, чем " + student.getFio());
        } else {
            System.out.println(getFio() + " и " + student.getFio() + " трансгрессируют на одинаковое расстояние");
        }


        this.compareByFaculty(student);
    }

    protected void printCompletionResult(String firstFio, String secondFio, int firstValue, int secondValue, String string) {
        String result;

        if (firstValue > secondValue) {
            result = " имеет характеристику '" + string + "' больше, чем ";
        } else if (firstValue < secondValue) {
            result = " имеет характеристику '" + string + "' меньше, чем ";
        } else {
            result = " имеет характеристику '" + string + "' равную с ";
        }


        System.out.println(firstFio + " (" + firstValue + ")" + result + secondFio + " (" + secondValue + ")");
    }
}

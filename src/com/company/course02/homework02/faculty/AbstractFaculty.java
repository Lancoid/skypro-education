package com.company.course02.homework02.faculty;

import java.util.ArrayList;

abstract class AbstractFaculty implements FacultyInterface {
    protected String name;
    protected FacultyProperties[] properties;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.name);
        stringBuilder.append(" { ");

        ArrayList<String> list = new ArrayList<>();

        for (FacultyProperties property : properties) {
            list.add(property.getName());
        }

        stringBuilder.append(String.join(", ", list));
        stringBuilder.append(" }");

        return stringBuilder.toString();
    }
}

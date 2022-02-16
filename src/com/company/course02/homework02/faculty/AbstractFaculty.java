package com.company.course02.homework02.faculty;

import java.util.ArrayList;

abstract class AbstractFaculty implements FacultyInterface {
    protected FacultyNames name;
    protected FacultyProperties[] properties;

    protected int nobility = 0;
    protected int honor = 0;
    protected int bravery = 0;
    protected int industriousness = 0;
    protected int loyalty = 0;
    protected int honesty = 0;
    protected int mind = 0;
    protected int wisdom = 0;
    protected int wit = 0;
    protected int creation = 0;
    protected int cunning = 0;
    protected int determination = 0;
    protected int ambition = 0;
    protected int inventiveness = 0;
    protected int lustForPower = 0;

    @Override
    public String getName() {
        return this.name.getName();
    }

    @Override
    public int getNobility() {
        return nobility;
    }

    @Override
    public int getHonor() {
        return honor;
    }

    @Override
    public int getBravery() {
        return bravery;
    }

    @Override
    public int getIndustriousness() {
        return industriousness;
    }

    @Override
    public int getLoyalty() {
        return loyalty;
    }

    @Override
    public int getHonesty() {
        return honesty;
    }

    @Override
    public int getMind() {
        return mind;
    }

    @Override
    public int getWisdom() {
        return wisdom;
    }

    @Override
    public int getWit() {
        return wit;
    }

    @Override
    public int getCreation() {
        return creation;
    }

    @Override
    public int getCunning() {
        return cunning;
    }

    @Override
    public int getDetermination() {
        return determination;
    }

    @Override
    public int getAmbition() {
        return ambition;
    }

    @Override
    public int getInventiveness() {
        return inventiveness;
    }

    @Override
    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getName());
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

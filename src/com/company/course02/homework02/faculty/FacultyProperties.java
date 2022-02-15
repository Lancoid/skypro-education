package com.company.course02.homework02.faculty;

public enum FacultyProperties {
    NOBILITY("благородство"),
    HONOR("честь"),
    BRAVERY("храбрость"),

    INDUSTRIOUSNESS("трудолюбие"),
    LOYALTY("верность"),
    HONESTY("честность"),

    MIND("ум"),
    WISDOM("мудрость"),
    WIT("остроумие"),
    CREATION("творчество"),

    CUNNING("хитрость"),
    DETERMINATION("решительность"),
    AMBITION("амбициозность"),
    INVENTIVENESS("находчивость"),
    LUST_FOR_POWER("жажда власти");

    private final String name;

    FacultyProperties(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

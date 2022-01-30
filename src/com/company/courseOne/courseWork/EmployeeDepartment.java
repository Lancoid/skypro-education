package com.company.courseOne.courseWork;

public enum EmployeeDepartment {
    EXPORT("Отдел экспорта"),
    IMPORT("Отдел импорта"),
    HUMAN_RESOURCES("Отдел кадров"),
    FINANCE("Отдел финансов"),
    PRODUCTION("Отдел производства");

    private final String name;

    EmployeeDepartment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

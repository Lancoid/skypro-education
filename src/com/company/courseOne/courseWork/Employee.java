package com.company.courseOne.courseWork;

public class Employee {
    private static int idCounter = 0;
    private final Integer id;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private EmployeeDepartment department;
    private float salary;

    public Employee(String firstName, String middleName, String lastName, EmployeeDepartment department, float salary) {
        this.id = ++idCounter;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public EmployeeDepartment getDepartment() {
        return this.department;
    }

    public void setDepartment(EmployeeDepartment department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = (float) (Math.round(salary * 100.0) / 100.0);
    }

    public float getSalary() {
        return salary;
    }

    public String getFio() {
        return firstName.charAt(0) + "." + middleName.charAt(0) + "." + lastName;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}

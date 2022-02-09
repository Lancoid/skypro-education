package com.company.course01.courseWork;

public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(int employeesCount) {
        employees = new Employee[employeesCount];
    }

    public void recruitEmployee(String firstName, String middleName, String lastName, EmployeeDepartment department, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(firstName, middleName, lastName, department, salary);

                System.out.println("Сотрудник '" + employees[i].getFio() + "' нанят");

                return;
            }
        }

        throw new RuntimeException("Книга сотрудников полная, расширяйте штат");
    }

    public void fireAnEmployee(String firstName, String middleName, String lastName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && checkEmployee(employees[i], firstName, middleName, lastName)) {
                String fio = employees[i].getFio();
                employees[i] = null;

                if (employees[i] == null) {
                    System.out.println("Сотрудник " + fio + " уволен");
                }

                return;
            }
        }
    }

    public void getAllEmployees(EmployeeDepartment department) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (department != null && (employee.getDepartment() == null || !employee.getDepartment().equals(department))) {
                    continue;
                }
                System.out.println(employee);
            }
        }
    }

    public void findTotalSalary(EmployeeDepartment department) {
        float result = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                if (department != null && (employee.getDepartment() == null || !employee.getDepartment().equals(department))) {
                    continue;
                }
                result += employee.getSalary();
            }
        }

        System.out.println("Сумма затрат на зарплаты в месяц " + result + "р.");
    }

    public void findEmployeeWithMinimumSalary(EmployeeDepartment department) {
        Employee employeeResult = null;

        for (Employee employee : employees) {
            if (employee != null && (employeeResult == null || employee.getSalary() < employeeResult.getSalary())) {
                if (department != null && (employee.getDepartment() == null || !employee.getDepartment().equals(department))) {
                    continue;
                }
                employeeResult = employee;
            }
        }

        if (employeeResult != null) {
            System.out.println("Сотрудник с минимальной зарплатой в месяц '" + employeeResult.getFio() + "' - " + employeeResult.getSalary() + "р.");
        }
    }

    public void findEmployeeWithMaximumSalary(EmployeeDepartment department) {
        Employee employeeResult = null;

        for (Employee employee : employees) {
            if (employee != null && (employeeResult == null || employee.getSalary() > employeeResult.getSalary())) {
                if (department != null && (employee.getDepartment() == null || !employee.getDepartment().equals(department))) {
                    continue;
                }
                employeeResult = employee;
            }
        }

        if (employeeResult != null) {
            System.out.println("Сотрудник с максимальной зарплатой в месяц '" + employeeResult.getFio() + "' - " + employeeResult.getSalary() + "р.");
        }
    }

    public void findAverageSalary(EmployeeDepartment department) {
        float totalSalary = 0;
        int employeesCounter = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                if (department != null && (employee.getDepartment() == null || !employee.getDepartment().equals(department))) {
                    continue;
                }
                totalSalary += employee.getSalary();
                ++employeesCounter;
            }
        }

        if (totalSalary > 0) {
            System.out.println("Среднее значение зарплат " + (totalSalary / employeesCounter) + "р.");
        }
    }

    public void getAllEmployeesFio(EmployeeDepartment department) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (department != null && (employee.getDepartment() == null || !employee.getDepartment().equals(department))) {
                    continue;
                }
                System.out.println("Сотрудник - " + employee.getFio());
            }
        }
    }

    public void findEmployeesBySalaryLess(float salary) {
        for (Employee employee : employees) {
            if (employee != null && salary > employee.getSalary()) {
                System.out.println("У сотрудника '" + employee.getFio() + "' зарплата меньше, чем " + salary + "р.");
            }
        }
    }

    public void findEmployeesBySalaryMoreOrEquals(float salary) {
        for (Employee employee : employees) {
            if (employee != null && salary <= employee.getSalary()) {
                System.out.println("У сотрудника '" + employee.getFio() + "' зарплата больше или равно, чем " + salary + "р.");
            }
        }
    }

    public void increaseSalary(float percent, EmployeeDepartment department) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (department != null && (employee.getDepartment() == null || !employee.getDepartment().equals(department))) {
                    continue;
                }
                float salaryModifier = (100 + percent) / 100;
                employee.setSalary(employee.getSalary() * salaryModifier);

                System.out.println("У сотрудника '" + employee.getFio() +
                        "' зарплата увеличилась на " + percent + "% и стала равняться " + employee.getSalary() + "р.");
            }
        }
    }

    public void changeEmployeeSalary(float percent, boolean isIncrease, String firstName, String middleName, String lastName) {
        for (Employee employee : employees) {
            if (employee != null && checkEmployee(employee, firstName, middleName, lastName)) {
                float salaryModifier = (isIncrease ? ((float) 100 + percent) : ((float) 100 - percent)) / 100;
                String string = isIncrease ? "увеличилась" : "уменьшилась";
                employee.setSalary(employee.getSalary() * salaryModifier);

                System.out.println("У сотрудника '" + employee.getFio() + "' зарплата " + string + " на " +
                        percent + "% и стала равняться " + employee.getSalary() + "р.");

                return;
            }
        }

        System.out.println("Сотрудник не найден");
    }

    public void changeDepartment(EmployeeDepartment department, String firstName, String middleName, String lastName) {
        for (Employee employee : employees) {
            if (employee != null && checkEmployee(employee, firstName, middleName, lastName)) {
                employee.setDepartment(department);

                System.out.println("Сотрудник '" + employee.getFio() + "' теперь работает в '" + employee.getDepartment().getName() + "'");

                return;
            }
        }

        System.out.println("Сотрудник не найден");
    }

    public void getDepartmentsInfo(EmployeeDepartment department) {
        System.out.println("Информация по \"" + department.getName() + "\" :");

        int departmentEmployees = 0;

        for (Employee employee : employees) {
            if (employee != null && (employee.getDepartment() == null || !employee.getDepartment().equals(department))) {
                ++departmentEmployees;
                System.out.println("Сотрудник '" + employee.getFio() + "', зарплата" + employee.getSalary() + "р.");
            }
        }

        if (departmentEmployees == 0) {
            System.out.println("--- нет сотрудников");
        }
    }


    public void getDepartmentsWithEmployees() {
        EmployeeDepartment[] departments = EmployeeDepartment.values();
        for (EmployeeDepartment department : departments) {
            System.out.println("Персонал в \"" + department.getName() + "\" :");
            boolean departmentHaveEmployees = false;

            for (Employee employee : employees) {
                if (employee != null) {
                    if (employee.getDepartment() == department) {
                        System.out.println("--- " + employee.getFio());
                        departmentHaveEmployees = true;
                    }
                }
            }

            if (!departmentHaveEmployees) {
                System.out.println("--- нет сотрудников");
            }
        }
    }

    private boolean checkEmployee(Employee employee, String firstName, String middleName, String lastName) {
        boolean isEqualsFirstName = employee.getFirstName().equals(firstName);
        boolean isEqualsMiddleName = employee.getMiddleName().equals(middleName);
        boolean isEqualsLastName = employee.getLastName().equals(lastName);

        return isEqualsFirstName && isEqualsMiddleName && isEqualsLastName;
    }
}

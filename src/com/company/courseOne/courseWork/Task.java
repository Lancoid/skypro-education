package com.company.courseOne.courseWork;

/**
 * Напишите программу, которая занимается учетом сотрудников и помогает кадрам и бухгалтерии автоматизировать процессы.
 *
 * 💡 Базовая сложность
 * 1. Создать класс Employee, который содержит информацию о ФИО, отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
 * 2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
 * 3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
 * 4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
 * 5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
 * 6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
 * 7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
 *
 * 💡 Очень сложно
 * 1. Привести структуру проекта к ООП.
 * 2. Создать класс EmployeeBook.
 * 3. Перенести хранилище сотрудников в него (массив), закрыть к нему доступ извне (сделать приватным).
 * 4. Все статические методы по работе с массивом перенести в этот класс и сделать нестатическими.
 */
public class Task {
    public static void main(String[] args) {
        System.out.println("----- Подготовка данных");
        EmployeeBook employeeBook = new EmployeeBook(15);

        employeeBook.recruitEmployee("София", "Ивановна", "Вдовина", EmployeeDepartment.EXPORT, 10000);
        employeeBook.recruitEmployee("Софья", "Алексеевна", "Филатова", EmployeeDepartment.EXPORT, 20000);
        employeeBook.recruitEmployee("Виктория", "Александровна", "Богданова", EmployeeDepartment.IMPORT, 30000);
        employeeBook.recruitEmployee("Марк", "Тимофеевич", "Семенов", EmployeeDepartment.IMPORT, 40000);
        employeeBook.recruitEmployee("Александра", "Владиславовна", "Колесникова", EmployeeDepartment.HUMAN_RESOURCES, 50000);
        employeeBook.recruitEmployee("Татьяна", "Максимовна", "Степанова", EmployeeDepartment.HUMAN_RESOURCES, 60000);
        employeeBook.recruitEmployee("Николай", "Яковлевич", "Петухов", EmployeeDepartment.FINANCE, 70000);
        employeeBook.recruitEmployee("Анастасия", "Артёмовна", "Глушкова", EmployeeDepartment.FINANCE, 80000);
        employeeBook.recruitEmployee("Ясмина", "Артёмовна", "Дубова", EmployeeDepartment.PRODUCTION, 90000);
        employeeBook.recruitEmployee("Елизавета", "Филипповна", "Большакова", EmployeeDepartment.PRODUCTION, 100000);

        /* **************************************************************************************************************************************** */

        System.out.println("----- Базовая сложность - 1. Получить список всех сотрудников со всеми имеющимися по ним данными");
        employeeBook.getAllEmployees(null);
        System.out.println("-----");

        System.out.println("----- Базовая сложность - 2. Посчитать сумму затрат на зарплаты в месяц");
        employeeBook.findTotalSalary(null);
        System.out.println("-----");

        System.out.println("----- Базовая сложность - 3. Найти сотрудника с минимальной зарплатой");
        employeeBook.findEmployeeWithMinimumSalary(null);
        System.out.println("-----");

        System.out.println("----- Базовая сложность - 4. Найти сотрудника с максимальной зарплатой");
        employeeBook.findEmployeeWithMaximumSalary(null);
        System.out.println("-----");

        System.out.println("----- Базовая сложность - 5. Подсчитать среднее значение зарплат");
        employeeBook.findAverageSalary(null);
        System.out.println("-----");

        System.out.println("----- Базовая сложность - 6. Получить Ф.И.О. всех сотрудников");
        employeeBook.getAllEmployeesFio(null);
        System.out.println("-----");

        /* **************************************************************************************************************************************** */

        System.out.println("----- Повышенная сложность - 1. Проиндексировать зарплату (у всех сотрудников на величину аргумента в %)");
        employeeBook.increaseSalary(12.3f, EmployeeDepartment.EXPORT);
        System.out.println("-----");

        System.out.println("----- Повышенная сложность - 2. Получить в качестве параметра отдел и найти:");

        System.out.println("-- Сотрудника с минимальной зарплатой");
        employeeBook.findEmployeeWithMinimumSalary(EmployeeDepartment.EXPORT);
        System.out.println("-----");

        System.out.println("-- Сотрудника с максимальной зарплатой");
        employeeBook.findEmployeeWithMaximumSalary(EmployeeDepartment.EXPORT);
        System.out.println("-----");

        System.out.println("-- Сумму затрат на зарплату по отделу");
        employeeBook.findTotalSalary(EmployeeDepartment.EXPORT);
        System.out.println("-----");

        System.out.println("-- Среднюю зарплату по отделу");
        employeeBook.findAverageSalary(EmployeeDepartment.EXPORT);
        System.out.println("-----");

        System.out.println("-- Проиндексировать зарплату всех сотрудников отдела на величину аргумента в %");
        employeeBook.increaseSalary(32.1f, EmployeeDepartment.EXPORT);
        System.out.println("-----");

        System.out.println("-- Напечатать всех сотрудников отдела (все данные, кроме отдела)");
        employeeBook.getDepartmentsInfo(EmployeeDepartment.EXPORT);
        System.out.println("-----");

        System.out.println("----- Повышенная сложность - 3. Получить в качестве параметра число и найти:");

        System.out.println("-- Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль)");
        employeeBook.findEmployeesBySalary(50000, true);
        System.out.println("-----");

        System.out.println("-- Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль)");
        employeeBook.findEmployeesBySalary(50000, false);
        System.out.println("-----");

        /* **************************************************************************************************************************************** */

        System.out.println("----- Очень сложно - 1. Добавить нового сотрудника");
        employeeBook.recruitEmployee("Ксения", "Львовна", "Панова", EmployeeDepartment.EXPORT, 12500);
        employeeBook.recruitEmployee("Александр", "Артёмович", "Ефимов", EmployeeDepartment.PRODUCTION, 16000);
        System.out.println("-----");

        System.out.println("----- Очень сложно - 2. Удалить сотрудника (находим сотрудника по Ф. И. О. и/или id, обнуляем его ячейку в массиве)");
        employeeBook.fireAnEmployee(11, "", "", "");
        employeeBook.fireAnEmployee(null, "Александр", "Артёмович", "Ефимов");
        System.out.println("-----");

        System.out.println("----- Очень сложно - 3. Изменить зарплату сотрудника (получить сотрудника по ФИО, модернизировать его запись)");
        employeeBook.changeEmployeeSalary(10, true, null, "Ясмина", "Артёмовна", "Дубова");
        System.out.println("-----");

        System.out.println("----- Очень сложно - 4. Изменить отдел сотрудника (получить сотрудника по ФИО, модернизировать его запись)");
        employeeBook.changeDepartment(EmployeeDepartment.PRODUCTION, 3, "", "", "");
        employeeBook.changeDepartment(EmployeeDepartment.HUMAN_RESOURCES, null, "Анастасия", "Артёмовна", "Глушкова");
        System.out.println("-----");

        System.out.println("----- Очень сложно - 5. Получить Ф. И. О. всех сотрудников по отделам (напечатать список отделов и их сотрудников)");
        employeeBook.getDepartmentsWithEmployees();
        System.out.println("-----");
    }
}

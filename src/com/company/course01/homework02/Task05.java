package com.company.course01.homework02;

/*
 * Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
 * В компании есть правило, что чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
 * Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
 * Каждый год повышение составляет 10% от текущей зарплаты.
 *
 * К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
 * Маша получает 67 760 рублей в месяц
 * Денис получает 83 690 рублей в месяц
 * Кристина получает 76 230 рублей в месяц
 *
 * Каждому нужно увеличить зарплату на 10% от текущей месячной.
 * Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
 * Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
 *
 * Выведите в консоль информацию по каждому сотруднику.
 * Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”.
 */
public class Task05 {
    public static void main(String[] args) {
        int salaryIncreasePercentage = 10;

        int mariaSalaryOld = 67_760;
        int mariaSalaryNew = getNewSalary(mariaSalaryOld, salaryIncreasePercentage);
        int mariaDifferenceAnnualSalaries = (mariaSalaryNew * 12) - (mariaSalaryOld * 12);

        System.out.println("Маша теперь получает " + mariaSalaryNew + " рублей. Годовой доход вырос на " + mariaDifferenceAnnualSalaries + " рублей");

        int denisSalaryOld = 83_690;
        int denisSalaryNew = getNewSalary(denisSalaryOld, salaryIncreasePercentage);
        int denisDifferenceAnnualSalaries = (denisSalaryNew * 12) - (denisSalaryOld * 12);

        System.out.println("Денис теперь получает " + denisSalaryNew + " рублей. Годовой доход вырос на " + denisDifferenceAnnualSalaries + " рублей");

        int kristinaSalaryOld = 76_230;
        int kristinaSalaryNew = getNewSalary(kristinaSalaryOld, salaryIncreasePercentage);
        int kristinaDifferenceAnnualSalaries = (kristinaSalaryNew * 12) - (kristinaSalaryOld * 12);

        System.out.println("Кристина теперь получает " + kristinaSalaryNew + " рублей. Годовой доход вырос на " + kristinaDifferenceAnnualSalaries + " рублей");
    }

    private static int getNewSalary(float oldSalary, int increasePercentage) {
        return (int) (((float) (increasePercentage + 100) / 100) * oldSalary);
    }
}

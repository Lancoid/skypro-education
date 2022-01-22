package com.company.courseOne.homework08;

/**
 * Возвращаемся к любимой многими задаче на расчет дней доставки банковской карты от банка.
 *
 * @see com.company.courseOne.homework3.Task04
 *
 * Наша задача — доработать код,
 * а именно написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.
 */
public class Task03 {
    public static void main(String[] args) {
        int deliveryDistance = 95;

        System.out.println("Потребуется дней: " + getDeliveryTime(deliveryDistance));
    }

    public static int getDeliveryTime(int deliveryDistance) {
        int deliveryTime = 1;

        if (deliveryDistance > 10) {
            deliveryTime += 1;
        }
        if (deliveryDistance > 60) {
            deliveryTime += 1;
        }

        return deliveryTime;
    }
}

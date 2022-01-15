package com.company.courseOne.homework2;

/*
 * В боксе, перед каждым боем, спортсменов взвешивают.
 * Это делают для того, чтобы убедиться, что боксеры соответствуют своей весовой категории, и бой будет честным.
 *
 * Вес одного боксера – 78,2 кг.
 * Вес второго боксера – 82,7 кг.
 *
 * Подсчитайте и выведите в консоль общий вес двух бойцов.
 * Подсчитайте и выведите в консоль разницу между весами бойцов.
 */
public class Task02 {
    public static void main(String[] args) {
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;

        float totalWeight = firstBoxerWeight + secondBoxerWeight;
        float differenceWeight = firstBoxerWeight - secondBoxerWeight;

        System.out.println("Общий вес двух бойцов - " + totalWeight + "кг.");
        System.out.println("Разница между весами бойцов - " + (differenceWeight < 0 ? -differenceWeight : differenceWeight) + " кг.");
    }
}

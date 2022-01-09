package com.company.courseOne.homework4;

/**
 * Необходимо пройти циклом по числам от 1 до 30 включительно и :
 * 1 - если число делится на 3 без остатка, вывести ping
 * 2 - если число делится на 5 без остатка, вывести pong
 * 3 - если число делится без остатка и на 3, и на 5, необходимо вывести ping pong
 */
public class Task4
{
    public static void main(String[] args)
    {
        boolean isDivisibleByThree;
        boolean isDivisibleByFive;

        for (int counter = 1; counter <= 30; counter++) {
            isDivisibleByThree = counter % 3 == 0;
            isDivisibleByFive = counter % 5 == 0;

            if (isDivisibleByThree && isDivisibleByFive) {
                System.out.println(counter + ": ping pong");
            } else if (isDivisibleByFive) {
                System.out.println(counter + ": pong");
            } else if (isDivisibleByThree) {
                System.out.println(counter + ": ping");
            } else {
                System.out.println(counter + ":");
            }
        }
    }
}

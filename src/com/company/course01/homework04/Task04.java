package com.company.course01.homework04;

/**
 * Необходимо пройти циклом по числам от 1 до 30 включительно и :
 * 1 - если число делится на 3 без остатка, вывести ping
 * 2 - если число делится на 5 без остатка, вывести pong
 * 3 - если число делится без остатка и на 3, и на 5, необходимо вывести ping pong
 */
public class Task04 {
    public static void main(String[] args) {
        boolean isDivisibleByThree;
        boolean isDivisibleByFive;
        StringBuilder result;

        for (int counter = 1; counter <= 30; counter++) {
            isDivisibleByThree = counter % 3 == 0;
            isDivisibleByFive = counter % 5 == 0;

            result = new StringBuilder();
            result.append(counter).append(":");

            if (isDivisibleByThree) {
                result.append(" ping");
            }
            if (isDivisibleByFive) {
                result.append(" pong");
            }

            System.out.println(result);
        }
    }
}

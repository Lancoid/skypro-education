package com.company.courseOne.homework3;

/*
 * Представим, что мы работаем в банке.
 * У нашего банка есть сайт, на который можно зайти с компьютера или телефона, а также мобильное приложение.
 * И нам, и клиенту удобнее с телефона пользоваться мобильным приложением.
 * Поэтому каждый раз, когда пользователь заходит на сайт с телефона, мы должны выдавать ему ссылку на скачивание приложения.
 * Но мы не знаем, iOS или Android он использует.
 *
 * Напишите программу, которая определяет, чем пользуется клиент (iOS или Android), и выдает соответствующее сообщение для обоих вариантов.
 * Объявите переменную clientOS, которая равна 0 или 1.0 — iOS, 1 — Android.
 * При отработке программы в консоли должно выдаваться сообщение об установке соответствующего приложения.
 *
 * Например, для iOS оно будет звучать так:
 * «Установите версию приложения для iOS по ссылке».
 * А для Android так:
 * «Установите версию приложения для Android по ссылке».
 */
@SuppressWarnings("ConstantConditions")
public class Task1
{
    private static final int IOS = 0;
    private static final int ANDROID = 1;

    public static void main(String[] args)
    {
        int clientOS = 1;

        if (clientOS == IOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == ANDROID) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
}

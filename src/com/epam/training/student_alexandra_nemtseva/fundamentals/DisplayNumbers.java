package com.epam.training.student_alexandra_nemtseva.fundamentals;

import java.util.Random;
import java.util.Scanner;

/**
 * Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
 */
public class DisplayNumbers {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел для вывода:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Random x = new Random();

        System.out.println("Выведем числа с переходом на новую строку:");
        for (int i = 0; i<number; i++){
            int a = x.ints(1,100).findFirst().getAsInt();
            System.out.println(a);
        }

        System.out.println("Выведем числа без перехода на новую строку:");
        for (int i = 0; i<number; i++){
            int a = x.ints(1,100).findFirst().getAsInt();
            System.out.print(a + " ");
        }
    }
}

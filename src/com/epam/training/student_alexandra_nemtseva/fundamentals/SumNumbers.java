package com.epam.training.student_alexandra_nemtseva.fundamentals;

import java.util.Scanner;

/**
 * Ввести целые числа как аргументы командной строки,
 * подсчитать их сумму (произведение) и вывести результат на консоль.
 */
public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целые числа: ");
        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();
        int sum = sumNumbers(a,b);
        int multiply = multiplyNumbers(a,b);
        System.out.println("Сумма чисел " + a + " и " + b + " равна " + sum);
        System.out.println("Произведение чисел " + a + " и " + b + " равно " + multiply);
    }

    static int sumNumbers (int a, int b){
        return a+b;
    }

    static int multiplyNumbers (int a, int b){
        return a*b;
    }
}

package com.epam.training.student_alexandra_nemtseva.fundamentals;

import java.util.Scanner;

/**
 * Ввести целые числа как аргументы командной строки,
 * подсчитать их сумму (произведение) и вывести результат на консоль.
 */
public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type an integer number: ");
        System.out.print("A: ");
        int a = 0;
        boolean aExists = false;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            aExists = true;
        }else{
            System.out.println("Wrong number!");
        }
        System.out.print("B: ");
        int b = 0;
        boolean bExists = false;
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
            bExists = true;
        }else{
            System.out.println("Wrong number!");
        }

        if (aExists && bExists) {
            int sum = sumNumbers(a, b);
            int multiply = multiplyNumbers(a, b);
            System.out.println("Sum of numbers " + a + " and " + b + " is " + sum);
            System.out.println("Product of numbers " + a + " and " + b + " is " + multiply);
        }else{
            System.out.println("Sum and product of numbers cannot be counted!");
        }
    }

    static int sumNumbers (int a, int b){
        return a+b;
    }

    static int multiplyNumbers (int a, int b){
        return a*b;
    }
}

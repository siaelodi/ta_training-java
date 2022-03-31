package com.epam.training.student_alexandra_nemtseva.fundamentals;

import java.util.Random;
import java.util.Scanner;

/**
 * Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
 */
public class DisplayNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        System.out.println("Type an amount of numbers:");

        if (scanner.hasNextInt()){
            number = scanner.nextInt();
            print(number);
        }else{
            System.out.println("Wrong number!");
        }

    }

    static void print(int number){
        Random x = new Random();

        System.out.println("Let's print the numbers with a new line:");
        for (int i = 0; i<number; i++){
            int a = x.ints(1,100).findFirst().getAsInt();
            System.out.println(a);
        }

        System.out.println("Let's print the numbers without a new line :");
        for (int i = 0; i<number; i++){
            int a = x.ints(1,100).findFirst().getAsInt();
            System.out.print(a + " ");
        }
    }
}

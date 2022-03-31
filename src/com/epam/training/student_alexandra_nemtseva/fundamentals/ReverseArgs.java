package com.epam.training.student_alexandra_nemtseva.fundamentals;

/**
 * Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */
public class ReverseArgs {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++){
            System.out.println(String.format("Argument %d: %s", i, args[i]));
        }
    }
}
